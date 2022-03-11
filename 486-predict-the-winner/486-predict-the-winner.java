class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int total = 0;
        for(int num:nums){
            total+=num;
        }
        
        int n = nums.length;
        int[][]dp = new int[n][n];
     
        for(int[]dpp:dp){
            Arrays.fill(dpp,-1);
        }
        
        int p1Score = predictWinner(nums,0,n-1,dp);
        return (p1Score>=total-p1Score);
    }
    
    public int predictWinner(int[]nums,int i,int j, int[][]dp){
       
        if(i>j){
            return 0;
        }
        
        if(i==j)return nums[i];
               
        if(dp[i][j]!=-1)return dp[i][j];
    
        int case1 = nums[i] + Math.min(predictWinner(nums,i+1,j-1,dp),predictWinner(nums,i+2,j,dp));
        int case2 = nums[j] + Math.min(predictWinner(nums,i+1,j-1,dp),predictWinner(nums,i,j-2,dp)); 
        
        return dp[i][j] = Math.max(case1,case2);    
    }
}