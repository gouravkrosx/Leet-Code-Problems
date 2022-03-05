class Solution {
    public int deleteAndEarn(int[] nums) {
        Arrays.sort(nums);
        
        int[]dp = new int[nums.length];
        Arrays.fill(dp,-1);
        return maxPoints(nums,0,dp);
    }
    public int maxPoints(int[]nums,int idx,int[]dp){
        if(idx==nums.length)return 0;
        
        if(dp[idx]!=-1)return dp[idx];
        
        int ele = nums[idx];
        int skip = idx+1;
        int earn = nums[idx];
        
        //collecting all same/duplicates elements 
        while(skip<nums.length && nums[skip]==nums[idx]){
            earn+=nums[idx];
            skip++;
        }
        
        //skipping the nums[i]+1 elements;
        
        while(skip<nums.length && nums[skip]==nums[idx]+1){
            skip++;
        }
        //take
        earn+=maxPoints(nums,skip,dp);
        //no take
        int notEarn = maxPoints(nums,idx+1,dp);
        
        return dp[idx]=Math.max(earn,notEarn);
    
    }
}