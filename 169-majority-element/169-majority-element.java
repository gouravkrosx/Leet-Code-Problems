class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        
        int max=0;
        
        for(int i=1;i<nums.length;i++){
            if(nums[max]==nums[i]){
                count++;
            }else{
                count--;
                
            }
            if(count==0){
                count=1;
                max=i;
            }
        }
        
        count=0;
        int maj = nums[max];
        for(int i=0;i<nums.length;i++){
            if(maj==nums[i]){
                count++;
            }
        }
        if(count>nums.length/2)return maj;
        else return 0;
    }
}