class Solution {
    public int rob(int[] nums) {
        int inc = nums[0];
        int ex = 0;
        
        for(int i=1;i<nums.length;i++){
            int ninc = ex + nums[i];
            int nex = Math.max(inc,ex);
            inc = ninc;
            ex = nex;
        }
        int ans = Math.max(inc,ex);
        return ans;
    }
}