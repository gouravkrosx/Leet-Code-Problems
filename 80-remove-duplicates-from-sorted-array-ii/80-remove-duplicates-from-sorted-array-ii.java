class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0;
        int j=1;
        int count=0;
        
        while(j<n){
            if(nums[i]==nums[j]){
                if(count==0){
                    i++;
                    nums[i]=nums[j];
                }
                count++;
            }else{
                count=0;
                i++;
                nums[i]=nums[j];
            }
            j++;
        }
        return i+1;
    }
}