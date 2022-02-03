class Solution {
    public int combinationSum4(int[] nums, int target) {
        
        int n = nums.length;
      // Difference between Coin change 2 and this problem is that, here we can have duplicates also. as given in the explanation but not           // there. So the order of the loop is the only change in this problem.
        
        int[]dp = new int[target+1];
        
        dp[0]=1;
        
        for(int tar=1;tar<=target;tar++){
            for(int i=0;i<n;i++){
                if(nums[i]<=tar){
                    dp[tar]+=dp[tar-nums[i]];
                }
            }
        }
        return dp[target];
    }
}