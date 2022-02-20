class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));
        
       int j=1; 
        int n = intervals.length;
        int count=0;
        while(j<n){
            int[] prev = intervals[j-1];
            int[] curr = intervals[j];
            if(curr[0]>prev[0]){
                if(curr[1]<=prev[1]){
                curr[0]=prev[0];
                curr[1]=prev[1];
                count++;    
                }
            }else if(curr[0]==prev[0]){
                  count++;
                if(curr[1]<prev[1]){
                    curr[1]=prev[1];
                }
            }
            j++;
        }
        return n-count;
    }
}