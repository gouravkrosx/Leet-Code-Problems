class Solution {
    public int minFallingPathSum(int[][] matrix) {
        
        int n = matrix.length;
        
        int[][]dp = new int[n][n];
        
        //base case
        for(int j=0;j<n;j++){
            dp[0][j] = matrix[0][j]; 
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<n;j++){
                int up = matrix[i][j] + dp[i-1][j];
                
                int dl = matrix[i][j];
                if(j>0)dl+=dp[i-1][j-1];
                else dl+=100000;
                
                int dr = matrix[i][j];
                if(j<n-1)dr+=dp[i-1][j+1];
                else dr+=100000;
                
                dp[i][j] = Math.min(up,Math.min(dl,dr));
            }
        }
        
        int mini=10000;
        
        for(int j=0;j<n;j++){
            mini = Math.min(mini,dp[n-1][j]);
        }
        
        return mini;    
    }
}