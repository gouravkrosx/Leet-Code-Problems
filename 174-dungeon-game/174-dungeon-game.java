class Solution {
    // For this approach refer the below discuss article and dry run the code (for 2x2 matrix) for a clear understanding.
  //  https://leetcode.com/problems/dungeon-game/discuss/745340/post-Dedicated-to-beginners-of-DP-or-have-no-clue-how-to-start
    
    public int calculateMinimumHP(int[][] dungeon) {
        int m = dungeon.length;
        int n = dungeon[0].length;
        
        int[][]dp = new int[m][n];
        
        for(int[]dpp:dp){
            Arrays.fill(dpp,-1);
        }
        
        // 1 is the min energy that must be given because if at any cell king energy becomes <=0 then he dies.
        return  minEnergy(dungeon,0,0,m,n,dp);
    }
    
    public int minEnergy(int[][]cell,int i,int j, int m,int n,int[][]dp){
        if(i==m || j==n)return 100000000;
        
        if(i==m-1 && j==n-1){
            return (cell[i][j]>0)?1:-(cell[i][j])+1;
        }
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        int minEnergyRequired = 0;
        
        int goRight = minEnergy(cell,i,j+1,m,n,dp);
        int goDown = minEnergy(cell,i+1,j,m,n,dp);
        
        minEnergyRequired = Math.min(goRight,goDown) - cell[i][j];
        
        return (dp[i][j] = (minEnergyRequired<=0)?1:minEnergyRequired);
    }
}