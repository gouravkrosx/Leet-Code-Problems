class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        int n = nums.length;
        
        Arrays.sort(nums);
        
        int lo = 0;
        int hi=nums[n-1];
        
        while(lo<hi){
            int mid = (lo+hi)/2;
            if(checkAbsDiffCount(nums,mid)<k){
                lo=mid+1;
            }else{
                hi=mid;
            }
        }
        return lo;
    }
    
    public int checkAbsDiffCount(int[]nums,int diff){
       int count=0;
       
        int i=0,j=0;
        while(j<nums.length){
            int d = nums[j]-nums[i];
            while(i<nums.length && nums[j]-nums[i]>diff){
                i++;
            }
            count+=j-i;
            j++;
        }
        return count;       
    }
    
}