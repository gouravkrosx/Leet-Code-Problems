class Solution {
    public int mctFromLeafValues(int[] arr) { 
     
        int n = arr.length;
     
        int[][][]dp = new int[n][n][2];
        return  maxCountTree(arr,0,n-1,dp)[0];
    }
//     {minSum,maxLeaf}
    public int[] maxCountTree(int[]arr,int si,int ei,int[][][]dp){
        if(si==ei){
            return new int[]{0,arr[si]};
        }
        
        if(dp[si][ei][0]!=0)return dp[si][ei];
    
        int ans = Integer.MAX_VALUE;
        int maxLeaf = 0;
        
        for(int k=si;k<ei;k++){
            int[] left = maxCountTree(arr,si,k,dp);
            int[] right = maxCountTree(arr,k+1,ei,dp);
            
            maxLeaf = Math.max(maxLeaf,Math.max(left[1],right[1]));
            
            int overAll = left[1]*right[1] + left[0] + right[0];
            ans = Math.min(ans,overAll);
        }
        return dp[si][ei]=new int[]{ans,maxLeaf};
    }
}