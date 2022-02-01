class Solution {
    public int maxProfit(int[] prices) {
        
        
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int ans=0;
        
        for(int i=0;i<prices.length;i++){
            min=Math.min(prices[i],min);
            max=Math.max(prices[i],max);
            //updating max if needed because max come after min;
            if(min==prices[i]){
                max=Integer.MIN_VALUE;
            }else{
                ans=Math.max(ans,max-min);
            }
        }
        
        
        return ans;        
        
    }
}