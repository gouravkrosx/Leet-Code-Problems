class Solution {
    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs,(a,b)->((a[0]-a[1])-(b[0]-b[1])));
        
        int n = costs.length/2;
        
        int cost = 0;
        for(int i=0;i<costs.length;i++){
            if(i<n){
                cost+=costs[i][0];
            }else{
                cost+=costs[i][1];
            }
        }
        return cost;
    }
}