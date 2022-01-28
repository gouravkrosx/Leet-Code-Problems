class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
       
        int m = grid.length;
        int n =grid[0].length;
        
        int[][]dp=new int[m][n];
    
        for(int[]dpp:dp){
            Arrays.fill(dpp,-1);
        }
        
        return solve(m-1,n-1,dp,grid);
    }
    public int solve(int i, int j, int[][]dp, int[][]grid){
        
        if(i>=0 && j>=0 && grid[i][j]==1)return 0;
        
        if(i==0 && j==0)return 1;
        
        if(i<0 || j<0)return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        int up = solve(i-1,j,dp,grid);
        int left = solve(i,j-1,dp,grid);
        
        return dp[i][j] = up+left;
    }    
}