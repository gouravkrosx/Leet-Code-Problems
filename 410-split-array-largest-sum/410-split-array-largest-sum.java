class Solution {
    public int splitArray(int[] nums, int m) {
        int lo = 0;
        int hi = 0;
        
        for(int val:nums){
            hi+=val;
        }
        
        int sum = 1;
        while(lo<=hi){
            int mid = (lo+hi)>>1;
            if(isValid(nums,m,mid)){
                sum = mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return sum;
    }
    public boolean isValid(int[]nums,int nos,int vsum){
        int sets=1;
        int sum=0;
        int i=0;
        while(i<nums.length){
            if(sum+nums[i]<=vsum){
                sum+=nums[i];
                i++;
            }else{
                sum=0;
                sets++;
            }
            
            if(sets>nos){
                return false;
            }
        }
        return true;
    }
}