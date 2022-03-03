class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length;
        if(n<3)return 0;
        
        int[]dp = new int[n];
        int pdiff = nums[1]-nums[0];
        
        int count=0;
        for(int i=2;i<n;i++){
             int diff = nums[i]-nums[i-1];
           
                if(diff==pdiff){
                    count++;
                    dp[i]=dp[i-1]+count;
                }else{
                    count=0;
                    dp[i]=dp[i-1];
                }
            pdiff=diff;
        }
        return dp[n-1];
    }
}