class Solution {
    public int uniquePaths(int m, int n) {
        int[][]dp=new int[m][n];
    
        for(int[]dpp:dp){
            Arrays.fill(dpp,-1);
        }
        
        return solve(m-1,n-1,dp);
    }
    public int solve(int i, int j, int[][]dp){
        if(i==0 && j==0)return 1;
        
        if(i<0 || j<0)return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        int up = solve(i-1,j,dp);
        int left = solve(i,j-1,dp);
        
        return dp[i][j] = up+left;
    }
}