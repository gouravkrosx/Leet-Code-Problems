class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i=0;
        while(i<n){
            if(nums[i]==i+1 || nums[i]<=0 || nums[i]>n){
                i++;
            }else if(nums[nums[i]-1]!=nums[i]){
                swap(nums,nums[i]-1,i);  // this will check the duplicates
            }else{
                //when no swap is required.
                i++;
            }
        }
        i=0;
        while(i<n && nums[i]==i+1)i++;
        
        return i+1;
    }
    public void swap(int[]arr,int x,int y){
        int temp = arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}