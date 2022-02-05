class Solution {
    public int numDistinct(String s, String t) {
        int m = s.length();
        int n = t.length();
        
        int[][]dp = new int[m][n];
        for(int[]dpp:dp){
            Arrays.fill(dpp,-1);
        }
        return distinctSubsequences(s,t,0,0,m,n,dp);
    }
    public int distinctSubsequences(String s,String t, int i,int j,int m,int n,int[][]dp){
        if(j==n){
            return 1;
        }
        if(i==m){
            if(j==n){
                return 1;
            }
            return 0;
        }
        
        if(dp[i][j]!=-1){
            return dp[i][j];
        }        
        
        char c1 = s.charAt(i);
        char c2 = t.charAt(j);
        
        int op1=0,op2=0,op3=0;
        if(c1==c2){
            op1 = distinctSubsequences(s,t,i+1,j+1,m,n,dp);
            op2 = distinctSubsequences(s,t,i+1,j,m,n,dp);
        }else{
            op3 = distinctSubsequences(s,t,i+1,j,m,n,dp);
        }
        return dp[i][j] = op1+op2+op3;
    }
}