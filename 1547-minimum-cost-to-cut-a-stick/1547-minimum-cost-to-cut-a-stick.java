class Solution {
    public int minCost(int n, int[] cuts) {
      // cuts array should be sorted in order to independently handle partitions

		// here n is the size of stick
		List<Integer> list = new ArrayList<>();
		list.add(0);
		for(int val:cuts)list.add(val);
		list.add(n);
		
		int size = cuts.length; //size of original cuts array
	
		cuts = list.stream().mapToInt(i -> i).toArray();
			
		Arrays.sort(cuts);
	
		int[][] dp = new int[size + 1][size + 1];

		for (int[] dpp : dp)
			Arrays.fill(dpp, -1);

		return minCost(1, size, cuts, dp);
        
    }
    public int minCost(int i, int j, int[]cuts, int[][]dp){
        if(i>j)return 0;
        
        if(dp[i][j]!=-1)return dp[i][j];
        
        int min = Integer.MAX_VALUE;
            
        for(int idx=i;idx<=j;idx++){
            int cost = cuts[j+1] - cuts[i-1]; // will give size of curr rem stick
            
            cost+= minCost(i,idx-1,cuts,dp)+minCost(idx+1,j,cuts,dp);
            min = Math.min(min,cost);
        }
        return dp[i][j] = min;
    }
}