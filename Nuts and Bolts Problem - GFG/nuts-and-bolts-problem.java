// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            char[] nuts = new char[n], bolts = new char[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                nuts[i] = (inputLine[i].charAt(0));
            }
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                bolts[i] = (inputLine[i].charAt(0));
            }

            new Solution().matchPairs(nuts, bolts, n);
            for (int i = 0; i < n; i++) {
                System.out.print(nuts[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                System.out.print(bolts[i] + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    void matchPairs(char nuts[], char bolts[], int n) {
       MatchPairs(nuts,bolts,0,n-1);
    }
    public void MatchPairs(char[]nuts,char[]bolts,int low,int hi){
        if(low<hi){
            int pivot=partition(nuts,low,hi,bolts[hi]);
            
            partition(bolts,low,hi,nuts[pivot]);
            
            MatchPairs(nuts,bolts,low,pivot-1);
            MatchPairs(nuts,bolts,pivot+1,hi);
        }
    }
    public int partition(char[]arr,int l,int h,char ch){
        int i=l;
        
        int j=l;
        while(j<h){
            if(arr[j]<ch){
                swap(arr,i,j);
                i++;
            }else if(arr[j]==ch){
                swap(arr,j,h);
                j--;
            }
            j++;
        }
        swap(arr,i,h);
        return i;
    }
    public void swap(char[]arr,int i,int j){
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}