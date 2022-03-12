class Solution {
    public int wiggleMaxLength(int[] arr) {
        
        if(arr.length==1)return 1;
        
        if(arr.length==2){
            return (arr[0]==arr[1])?1:2;
        }
        
        	int c = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i]-arr[i - 1]>0) {
				c = 1;
				break;
			} else if (arr[i]-arr[i - 1]<0) {
				c = 2;
				break;
			}
		}
		if (c == 0) {
			return 1;
		}
		int[] dp = new int[arr.length + 1];
		Arrays.fill(dp, -1);
		boolean flag = (c == 1) ? true : false;
		return wiggleMaxLength(arr, 0, dp, flag);
    }
   public int wiggleMaxLength(int[] arr, int idx, int[] dp, boolean f) {
		if (idx + 1 == arr.length)
			return 2;

		if (dp[idx] != -1)
			return dp[idx];

		int n = 0, p = 0, skip = 0;
		if (arr[idx+1]-arr[idx]<0 && f) {
			n = 1 + wiggleMaxLength(arr, idx + 1, dp, false);
		} else if (arr[idx+1]-arr[idx]>0 && !f) {
			p = 1 + wiggleMaxLength(arr, idx + 1, dp, true);
		}
		skip = wiggleMaxLength(arr, idx + 1, dp, f);
       
		int ans = Math.max(n, Math.max(p, skip));
		dp[idx] = ans;
		return ans;
	}
}