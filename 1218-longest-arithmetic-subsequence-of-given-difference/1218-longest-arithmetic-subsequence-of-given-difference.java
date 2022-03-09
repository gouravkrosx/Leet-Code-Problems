class Solution {
    public int longestSubsequence(int[] arr, int diff) {
        int[]dp = new int[arr.length];
        
        HashMap<Integer,Integer>map = new HashMap<>();
               
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]-diff)){
                int k = map.get(arr[i]-diff);
                dp[i]=1+dp[k];
            }else{
                dp[i]=1;
            }
            max = Math.max(max,dp[i]);
            map.put(arr[i],i);
        }
        return max;
    }
}