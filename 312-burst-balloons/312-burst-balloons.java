class Solution {
    // we have n! ways to burst the ballons 
    // for eg) {2 3 5} -> a) 2 3 5 , b) 2 5 3 , c) 3 5 2 , d) 3 2 5 , e) 5 2 3 , f) 5 3 2    => 3! = 6 ways
 /*   
    Intuition -> https://www.youtube.com/watch?v=YzvF8CqPafI
    
    1. We know that if only one ballon remains then the coins which we will get is  1*nums[i]*1;
    2. So we can say that we already know the ans for last ballon which get bursted.
    3. Hence we say that for each i we are considering that all the ballons in its left and right already get bursted means 
    it is the last ballon to get burst then what will be the max coins which we can collect.
    4. We are saying this because we know that there is no relation with the already bursted ballons.
   
   dp[i][j] stores that we you burst a range (i,j){ in a definite order } out of the whole array leaving other left and right elements as it is then what is the max coins you can collect.
   
   [a1,a2,a3,a4,(ai,ai1,ai2,ai3,....aj),an-2,an-1,an] <- so here suppose you have ai->aj range.
   Now for this we say that we are bursting 'ai' and (ai1->aj) is already bursted so coins we will get is (a4*ai*an-2);
   when we burst 'ai3', we consider that it is the last ballon to be bursted in the range (ai->aj)<- already bursted.
   so in this case we get coins =>(a4*ai3*an-2);
   
   
 */   
    public int maxCoins(int[] nums) {
        return BurstBallons(nums,0,nums.length-1,new int[nums.length][nums.length]);
    }
    public int BurstBallons(int[]nums,int start,int end,int[][]dp){
        if(start>end) return 0;
        
        if(dp[start][end]>0) return dp[start][end];
        
        int ans = 0;
        for(int i=start;i<=end;i++){
            int left=(start>0)?nums[start-1]:1;
            int right=(end<nums.length-1)?nums[end+1]:1;
            
            int sum=left*nums[i]*right + BurstBallons(nums,start,i-1,dp) + BurstBallons(nums,i+1,end,dp);
            ans=Math.max(sum,ans);
        }
        
        return dp[start][end] = ans;    
    }
}