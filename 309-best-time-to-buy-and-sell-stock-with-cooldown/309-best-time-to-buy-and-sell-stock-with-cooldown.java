class Solution {
    public int maxProfit(int[] prices) {
        //intuition : 
        // we will have 3 states i) index ii) own or now own iii) cooldown or not cooldown
        // cooldown only give problem while buying not with selling.
        
        // else the explaination remains same as buy and sell stock with transaction fee.
        
        int[][][]dp=new int[prices.length][2][2];
        
        for(int [][]dpp:dp){
            for(int[]dppp:dpp){
                Arrays.fill(dppp,-1);
            }
        }
        //since intially we don't have the cooldown
        return BuyNSellStockCooldown(0,0,0,prices,dp);
    }
    
    public int BuyNSellStockCooldown(int idx, int own ,int cooldown,int[]prices,int[][][]dp){
        if(idx==prices.length)return 0;
        
        
        if(dp[idx][own][cooldown]!=-1){
            return dp[idx][own][cooldown];
        }
        
        if(own==0){
            int op1 = (cooldown==1)?0: -(prices[idx]) + BuyNSellStockCooldown(idx+1,1,0,prices,dp);
            int op2 = BuyNSellStockCooldown(idx+1,0,0,prices,dp);
            return dp[idx][own][cooldown]=Math.max(op1,op2);
        }else{
            int op1 = prices[idx] + BuyNSellStockCooldown(idx+1,0,1,prices,dp); //as soon as i sell there will be cooldown.
            int op2= BuyNSellStockCooldown(idx+1,1,0,prices,dp);
            return dp[idx][own][cooldown]=Math.max(op1,op2);
        }
    }
}