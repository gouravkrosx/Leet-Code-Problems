class Solution {
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        
        int n = nums.length;
        int i=0,j=0;
        int res = 0 ;
        long sum = 0;
                
        while(j<n){
            sum+=nums[j];
            while(sum+k < (j-i+1)*nums[j]){
                sum-=nums[i];
                i++;
            }
            res = Math.max(res,j-i+1);
            j++;
        }
        return res;
    }
}