class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return atmost(nums,k) - atmost(nums,k-1);
    }
    public int atmost(int[]nums,int k){
        HashMap<Integer,Integer>map = new HashMap<>();
        int i=0,j=0;
        
        int result=0;
        while(j<nums.length){
            int val = nums[j];
            map.put(val,map.getOrDefault(val,0)+1);
            j++;
            while(map.size()>k && i<j){
                int temp = map.get(nums[i]);
                if(temp==1){
                    map.remove(nums[i]);
                }else{
                    map.put(nums[i],map.get(nums[i])-1);
                }
                i++;
            }
            result += j-i+1;
        }
        return result;
        
    }
}