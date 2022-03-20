class Solution {
    public int mctFromLeafValues(int[] arr) { 
     
        int n = arr.length;
     
        int[][]dp = new int[n][n];
        for(int[]dpp:dp)Arrays.fill(dpp,-1);
        return  maxCountTree(arr,0,n-1,dp);
    }
    
    public int maxCountTree(int[]arr,int si,int ei,int[][]dp){
        if(si==ei){
            return 0;
        }
        
        if(dp[si][ei]!=-1)return dp[si][ei];
    
        int ans = Integer.MAX_VALUE;
        
        for(int k=si;k<ei;k++){
            int left = maxCountTree(arr,si,k,dp);
            int right = maxCountTree(arr,k+1,ei,dp);
            
            int leftMax = 0;
            int rightMax = 0;
            for(int i=si;i<=k;i++)leftMax = Math.max(leftMax,arr[i]);
            for(int i=k+1;i<=ei;i++)rightMax = Math.max(rightMax,arr[i]);
            
            int overAll = leftMax*rightMax + left + right;
            ans = Math.min(ans,overAll);
        }
        return dp[si][ei]=ans;
    }
}