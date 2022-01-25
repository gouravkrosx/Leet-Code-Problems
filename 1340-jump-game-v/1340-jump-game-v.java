class Solution {
    public int maxJumps(int[] arr, int d) {
        
        int n = arr.length;    
        
        int[] dp = new int[n];
    
        Arrays.fill(dp,-1);
        
        int maxCount = 0;
        
        for(int i=0;i<n;i++){
            maxCount = Math.max(maxCount,maximumJumps(i,arr,d,dp));
        }
        
        return maxCount;
    }
    public int maximumJumps(int idx, int[]arr, int d, int[]dp){
        if(dp[idx]!=-1)return dp[idx];
        
        //checking the left side and find maximum reach there.
        int maxc = 0;
        for(int i=idx-1; i>=Math.max(0,idx-d);i--){
            if(arr[idx]<=arr[i])break;
            
            maxc=Math.max(maxc,maximumJumps(i,arr,d,dp));
        }
        
        //checking the right side and find maximum reach there.
        for(int i=idx+1; i<=Math.min(arr.length-1,idx+d);i++){
            if(arr[idx]<=arr[i])break;
            
            maxc=Math.max(maxc,maximumJumps(i,arr,d,dp));
        }
        
        //this one jump which first taken 
        maxc=maxc+1;
        
        return dp[idx] = maxc;
    }
}