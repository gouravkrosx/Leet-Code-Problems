class Solution {
    public int lenLongestFibSubseq(int[] arr) {
       
        int n = arr.length;
        int[][]dp = new int[n][n];
        HashMap<Integer,Integer>map = new HashMap<>();
        
        int max = 0;
        
        for(int i=0;i<n;i++){
            
            map.put(arr[i],i);
            
            for(int j=0;j<i;j++){
                Integer k = map.get(arr[i]-arr[j]);
                // the number arr[i]-arr[j] should be smaller than arr[j] because arr[j] is second number and 
                // if k is found then arr[k] will be first number.
                if(arr[i]-arr[j]<arr[j] && k!=null){
                    dp[i][j] = dp[j][k]+1; 
                    max = Math.max(max,dp[i][j]);
                }else{
                    dp[i][j] = 2;
                }
            }
        }
        
        return (max>2)?max:0;
    }
}