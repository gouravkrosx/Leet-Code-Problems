class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[]dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(minCost(cost,0,dp),minCost(cost,1,dp));
    }
    public int minCost(int[]cost,int i,int[]dp){
        if(i>=cost.length){
            return 0;
        }
        
        if(dp[i]!=-1)return dp[i];
        
        int oneStep = minCost(cost,i+1,dp);
        int twoStep = minCost(cost,i+2,dp);
        
        return dp[i] = Math.min(oneStep,twoStep) + cost[i];
    }
}