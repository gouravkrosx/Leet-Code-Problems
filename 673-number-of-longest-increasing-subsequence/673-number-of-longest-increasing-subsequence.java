class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n = nums.length;

        int[]dp = new int[n];
        int[]cnt = new int[n];
        Arrays.fill(dp,1);
        Arrays.fill(cnt,1);

        int max = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    if(dp[i]<dp[j]+1){
                        dp[i]=dp[j]+1;
                        cnt[i]=cnt[j];
                    }else if(dp[i]==dp[j]+1){
                        cnt[i]+=cnt[j];
                    }
                }
            }
            max = Math.max(dp[i],max);
        }
        
        int count=0;
        for(int i=0;i<n;i++){
            if(dp[i]==max){
                count+=cnt[i];
            }
        }
        return count;
    }
}