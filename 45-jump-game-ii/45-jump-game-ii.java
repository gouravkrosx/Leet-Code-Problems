class Solution {
    public int jump(int[] nums) {
        
       long[] dp = new long[nums.length];
		Arrays.fill(dp, -1);
		return (int)MinJumps(nums, 0, dp);
 
    }
    public static long MinJumps(int[] nums, int vidx, long[] dp) {
		if (vidx >= nums.length-1)
			return 0;

		if (dp[vidx] != -1) {
			return dp[vidx];
		}

		long jumps = Integer.MAX_VALUE;
		for (int val = vidx+1; val <= vidx+nums[vidx]; val++) {
            if(nums[vidx]!=0)
			jumps = Math.min(jumps, MinJumps(nums,val, dp));
		}
		jumps+=1;
		return dp[vidx]=jumps;
	}
}