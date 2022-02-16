class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        Stack<Integer>st = new Stack<Integer>();
        
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && nums2[i]>nums2[st.peek()]){
                int key = nums2[st.pop()];
                map.put(key,nums2[i]);
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            map.put(nums2[st.pop()],-1);
        }
        
        int[]res = new int[nums1.length];
        
        for(int i=0;i<res.length;i++){
            int val = map.get(nums1[i]);
            res[i]=val;
        }
        return res;
    }
}