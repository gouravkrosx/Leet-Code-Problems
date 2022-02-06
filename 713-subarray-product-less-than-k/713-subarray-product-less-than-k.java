class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        long pro=1l;
        int ans=0;

        int i=0,j=0;
        
        while(j<nums.length ){
            pro = pro * nums[j];
            
            while(i<=j && pro>=k){
                pro/=nums[i];
                i++;
            }
            ans+=(j-i+1);
            j++;
        }
        return ans;
    }
}