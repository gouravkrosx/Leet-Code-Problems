// { Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(str[i]);
            }

            String ans = new Solution().equilibrium(a, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    String equilibrium(int arr[], int n) {
       int lsum=0;
       int sum=0;
       
       for(int val:arr)sum+=val;
       
       for(int i=0;i<n;i++){
           sum-=arr[i];
           if(lsum==sum){
               return "YES";// basically i is the index
           }
           lsum+=arr[i];
       }
        return "NO";
    }
}