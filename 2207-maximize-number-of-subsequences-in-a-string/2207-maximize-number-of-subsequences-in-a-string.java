class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        char c1 = pattern.charAt(0);
        char c2 = pattern.charAt(1);
        
        int n = text.length();
        int m = pattern.length();
        
        Long[][]dp = new Long[n+1][m];
        

        long a1 = lcs(c1+text,pattern,n,m-1,dp);
        dp = new Long[n+1][m];
        long a2 = lcs(text+c2,pattern,n,m-1,dp); 

        return Math.max(a1,a2);
    }
    public long lcs(String text,String pattern,int i,int j,Long[][]dp){
        if(j<0){
            return 1l;
        }
        
        if(i<0){
            return 0l;
        }
        
        if(dp[i][j]!=null){
            return dp[i][j];
        }
        
        long ans =0l;
        if(text.charAt(i)==pattern.charAt(j)){
            ans = lcs(text,pattern,i-1,j-1,dp) + lcs(text,pattern,i-1,j,dp);
        }else{
            ans = lcs(text,pattern,i-1,j,dp);
        }
        
        return dp[i][j]=ans;
    }
}