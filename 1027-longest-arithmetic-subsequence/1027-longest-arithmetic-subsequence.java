class Solution {
    public int longestArithSeqLength(int[] nums) {
        
// dp[index][diff] equals to the length of arithmetic sequence at index with difference diff.
        int res = 2; 
        int n = nums.length;
        HashMap<Integer,Integer>[] dp = new HashMap[n];
        
        for(int i=0;i<n;i++){
            dp[i]=new HashMap<>();
            for(int j=0;j<i;j++){
                int diff = nums[i]-nums[j];
                
                //just as we do in LIS. 
                dp[i].put(diff,dp[j].getOrDefault(diff,1)+1);
                
                res = Math.max(res,dp[i].get(diff));
            }
        }
        return res;
    }
}