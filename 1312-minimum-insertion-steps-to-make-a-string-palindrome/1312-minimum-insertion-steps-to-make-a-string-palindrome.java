class Solution {
    public int minInsertions(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        
        int[][]dp=new int[s.length()][s.length()];
    
        for(int[]dpp:dp){
            Arrays.fill(dpp,-1);
        }
    
        return s.length()-lps(s,rev,s.length()-1,s.length()-1,dp);
    }
    public int lps(String s, String rev,int si,int ri,int[][]dp){
        if(si<0||ri<0){
            return 0;
        }
        
        if(dp[si][ri]!=-1)return dp[si][ri];
        
        if(s.charAt(si)==rev.charAt(ri)){
            return dp[si][ri]=lps(s,rev,si-1,ri-1,dp)+1;
        }
        
        return dp[si][ri]=Math.max(lps(s,rev,si-1,ri,dp),lps(s,rev,si,ri-1,dp));
    }
}