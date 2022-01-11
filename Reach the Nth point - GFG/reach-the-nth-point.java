// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            Solution ob = new Solution();
            int ans = ob.nthPoint(n);
            System.out.println(ans);            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int nthPoint(int n)
    {
        if(n==1)return 1;
        int[]dp=new int[n+1];
        Arrays.fill(dp,-1);
        countWaysUtil(n,2,dp);
        return dp[n]%1000000007;
    }
     static int countWaysUtil(int n, int m,int[]dp)
    {
        if (n <= 1)
            return 1;
            
        if(dp[n]!=-1)return dp[n];
            
        int res = 0;
        for (int i = 1; i <= m && i <= n; i++)
            res += countWaysUtil(n - i, m,dp)%1000000007;
        return dp[n]=res;
    }
}