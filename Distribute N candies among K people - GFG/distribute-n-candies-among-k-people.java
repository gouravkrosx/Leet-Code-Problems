// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            int N = Integer.parseInt(S[0]);
            int K = Integer.parseInt(S[1]);

            Solution ob = new Solution();
            Long[] res = ob.distributeCandies(N,K);
            
            for(int i=0; i<K; i++)
                System.out.print(res[i] + " ");
            System.out.println();
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution {
    static Long[] distributeCandies(int candies, int n) {
       Long[]res = new Long[n];
       
       for(int i=0;i<n;i++)res[i]=0l;
       
       for(int i=0;candies>0;i++){
           res[i%n]+= (long)Math.min(candies,i+1);
           candies-=i+1;
       }
       return res;
    }
};