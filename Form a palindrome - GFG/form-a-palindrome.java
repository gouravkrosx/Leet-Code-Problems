// { Driver Code Starts
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String str = read.readLine();

            Solution ob = new Solution();
            
            System.out.println(ob.countMin(str));
        }
    } 
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int countMin(String str)
    {   int n = str.length();
        int[][]dp = new int[n][n];
        for(int[]dpp:dp)Arrays.fill(dpp,-1);
        
       return findMinInsertions(str.toCharArray(),0,n-1,dp);
    }
    static int findMinInsertions(char str[], 
                                 int l, int h,int[][]dp)
    {
        // Base Cases
        if (l > h) 
            return Integer.MAX_VALUE;
  
        if (l == h) 
            return 0;
  
        if (l == h - 1) 
            return (str[l] == str[h]) ? 0 : 1;
        
        if(dp[l][h]!=-1)return dp[l][h];
            
        int a = 0;
        if(str[l]==str[h]){
            a = findMinInsertions(str,l+1,h-1,dp);
        }else{
            int x = findMinInsertions(str,l+1,h,dp);
            int y = findMinInsertions(str,l,h-1,dp);
            a = Math.min(x,y)+1;
        }
        return dp[l][h]=a;
    }
}