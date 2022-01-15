class Solution {
   
    //we are solving this greedily 
    // ->  we are basically shifting our lastgood index whenever an arr[i] can help to reach the lastgood index
    // we just update the lastgood index, it started from last, so if it can shift to 0 means that from 0 we can reach to 
    // the end.
    public boolean canJump(int[] nums) {
        if(nums.length==0){
            return false;
        }
        int n=nums.length;
        
        int lastgoodindex=n-1;
        
        for(int i=n-2;i>=0;i--){
            if(nums[i]+i>=lastgoodindex){
                lastgoodindex=i;
            }
        }
        return lastgoodindex==0;
    }
}