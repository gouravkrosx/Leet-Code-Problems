class Solution {
    public int maxProfit(int[] prices, int fee) {
        if(prices.length==0){
            return 0;
        }
        // at any ith day we have 2 options
        // if you don't own a stock-> 2 options either buy or not
        // if you own a stock -> 2 options either sell or not
        
        // as soon as i buy ->  - (prices[i]+fee);
        // as soon as i sell -> + prices[i] 
    
        int[][]dp=new int[prices.length][2];
        for(int[]dpp:dp){
            Arrays.fill(dpp,-1);
        }
        
        //since initally i don't own a stock so passing 0 for owning means not owning
        return BuyNSellStockWithFee(0,prices,fee,0,dp);
    }
    public int BuyNSellStockWithFee(int idx, int[]prices,int fee,int own,int[][]dp){
        if(idx==prices.length)return 0;
        
        if(dp[idx][own]!=-1){
            return dp[idx][own];
        }
        
        if(own==1){
            int op1 = prices[idx]+BuyNSellStockWithFee(idx+1,prices,fee,0,dp); //sell
            int op2 = BuyNSellStockWithFee(idx+1,prices,fee,1,dp); //not sell
            return dp[idx][own]=Math.max(op1,op2);
        }else{
            int op1 = -(prices[idx]+fee)+BuyNSellStockWithFee(idx+1,prices,fee,1,dp); //buy
            int op2 = BuyNSellStockWithFee(idx+1,prices,fee,0,dp); //not buy
            return dp[idx][own]=Math.max(op1,op2);
        }
    }
}