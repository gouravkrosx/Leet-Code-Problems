class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n = nums.length;
        int i =0,j=0;
        
        Deque<Integer>max = new LinkedList<>();
        Deque<Integer>min = new LinkedList<>();

        int res=0;
        
        while(j<n){
            
            while(!max.isEmpty() && nums[j]>max.peekLast()){
                max.pollLast();
            }
            while(!min.isEmpty() && nums[j]<min.peekLast()){
                min.pollLast();
            }
            
            min.addLast(nums[j]);
            max.addLast(nums[j]);
            
            while(max.peekFirst()-min.peekFirst()>limit){
              if(max.peekFirst()==nums[i])max.pollFirst();
              if(min.peekFirst()==nums[i])min.pollFirst();
              i++;
            }
            res = Math.max(res,j-i+1);            
            j++;
        }
        
        return res;
    }
}