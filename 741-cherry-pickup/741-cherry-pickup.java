class Solution {
    public int cherryPickup(int[][] grid) {
        int n = grid.length;
        int[][][]dp = new int[n][n][n];
        
              
        return Math.max(0,collectCherries(grid,n,0,0,0,dp));
        
    }
    // we are starting both journies form (0,0) itself and not like one from 0,0 and than return journey from (n-1,n-1)
    // and this is because the possible path combination from (0,0) to (n-1,n-1) is same as (n-1,n-1) to (0,0) even if there
    // are thorns (hurdles)
    public int collectCherries(int[][]grid,int n,int r1,int c1,int c2,int[][][]dp){
        
//since ( r1 + c1 = r2 + c2 ) because both starts at the same time and reach the destination (n-1,n-1) at the same time        
        int r2 = r1 + c1 - c2;
        
        if(r1>=n ||r2>=n || c1>=n || c2>=n || grid[r1][c1]==-1 || grid[r2][c2]==-1){
            return Integer.MIN_VALUE;
        } 
        
          
        if(dp[r1][c1][c2]!=0){
            return dp[r1][c1][c2];
        }
        
        if(r1==n-1 && c1==n-1){
            return grid[r1][c1];
        }
      
        
        int cherries = 0;
        if(r1==r2 && c1==c2){
            cherries = grid[r1][c1];
        }else{
            cherries = grid[r1][c1] + grid[r2][c2];
        }
        
        // four ways to explore 
        int dd = collectCherries(grid,n,r1+1,c1,c2,dp);
        int dr = collectCherries(grid,n,r1+1,c1,c2+1,dp);
        int rd = collectCherries(grid,n,r1,c1+1,c2,dp);
        int rr = collectCherries(grid,n,r1,c1+1,c2+1,dp);
        
        int max1 = Math.max(dd,rr);
        int max2 = Math.max(dr,rd);
        
        cherries += Math.max(max1,max2);
        
         dp[r1][c1][c2]=cherries;
        return  cherries; 
    }
}