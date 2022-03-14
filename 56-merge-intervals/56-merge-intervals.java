class Solution {
    public int[][] merge(int[][] intervals) {
        
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        
        int idx = 0;
        int[]start = intervals[0];
        int j=1;
        while(j<intervals.length){
            if(intervals[j][0]<=start[1]){
                intervals[idx][1] = Math.max(intervals[j][1],start[1]);
            }else{
                idx++;
                intervals[idx][0] = intervals[j][0];
                intervals[idx][1] = intervals[j][1];
                start = intervals[idx];    
            }
            j++;
        }
        idx++;
        int[][]ans = new int[idx][2];
        for(int i=0;i<idx;i++){
            ans[i]=intervals[i];
        }
        return ans;
    }
}