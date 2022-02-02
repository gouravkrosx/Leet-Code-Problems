class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        
        if(sum%2!=0)return false;
        
        int n = nums.length;
        
        int[][]dp = new int[n+1][sum/2 +1];
        
        for(int[]dpp:dp){
            Arrays.fill(dpp,-1);
        }
        int tar = sum/2;
        return partitionEqualSubsetSum(n-1,tar,nums,dp);
    }
    
    public boolean partitionEqualSubsetSum(int idx, int tar,int[]nums,int[][]dp){
        if(tar==0)return true;
        
        if(idx==0)return (nums[0]==tar);
    
        if(dp[idx][tar]!=-1){
            return (dp[idx][tar]==1)?true:false;
        }
        
        boolean pick = false;
        if(tar>=nums[idx]){
            pick = partitionEqualSubsetSum(idx-1,tar-nums[idx],nums,dp);    
        }
        
        boolean notPick = partitionEqualSubsetSum(idx-1,tar,nums,dp);

        boolean ans = pick || notPick;
        
        dp[idx][tar] = ((ans)? 1:2);
        return ans;
    }
}