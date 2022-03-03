class Solution {
    public boolean find132pattern(int[] nums) {
     Stack<Integer>st = new Stack<>();
       int s2 = Integer.MIN_VALUE;
        
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<s2)return true;
            
            while(!st.isEmpty() && nums[i]>st.peek()){
                s2=st.pop();
            }
            st.push(nums[i]);
        }
        return false;
    }
}