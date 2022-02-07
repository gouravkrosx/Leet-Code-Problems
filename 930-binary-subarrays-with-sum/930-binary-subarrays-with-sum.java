class Solution {
    public int numSubarraysWithSum(int[] nums, int k) {
        // atMostK(nums,k)<- this will give subarray sum <=k | atMostK(nums,k-1) <= this will give subarray sum <=k-1.
        // the diff atMostK(nums,k) - atmostK(nums,k-1) <- this will give subarray sum exactly  == k.
        return SubarraySumAtMostK(nums,k) - SubarraySumAtMostK(nums,k-1);     
     }
    public int SubarraySumAtMostK(int[]nums,int k){
        int sum=0;
        int i=0;
        int j=0;
        int ans=0;
        
        while(j<nums.length){
            sum+=nums[j];
            while(i<=j && sum>k){
                sum-=nums[i++];
            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
}