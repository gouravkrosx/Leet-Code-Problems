class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int n = nums.length;
        
        int closest = 1000000;
        for(int i=0;i<n-2;i++){
            int sum1=nums[i];
            
            int l = i+1;
            int r = n-1;
            
            while(l<r){
                int sum2 = nums[l]+nums[r]+sum1;
                
                if(Math.abs(sum2-target)<Math.abs(closest-target)){
                    closest = sum2;
                }
                
                if(sum2<target){
                    l++;
                }else{
                    r--;
                }
            }
        }
        return closest;
    }
}