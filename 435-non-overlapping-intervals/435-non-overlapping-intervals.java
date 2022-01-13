class Solution {
    
    /*
    
 key concept : pick interval with smallest end, because smallest end can hold most intervals. keep track of current element end. if next start is more than global end, remove that next element

sort by ending.
2 . keep track of previous end
if the next start > previous end, remove element
example:
arr : [[1,2],[2,3],[3,4],[1,3]]
sorted by end: [[1, 2], [2, 3], [1, 3], [3, 4]]
intervals with lowest end will allow us to fit more intervals
if the previous end is more than the next start, remove it.
in this case since [1,3] is removed since 1 is smaller than 3 of the previous end.
because this means that the interval has a smaller start than previous, but a bigger end which means that its interval is bigger and hence we should remove it   
    
    */
    
    public int eraseOverlapIntervals(int[][] intervals) {
     
        if(intervals.length==0)return 0;
        
        Arrays.sort(intervals,(int[]a,int[]b) ->a[1]-b[1]); //sorting with increasing end time
        
        int count=1;
        int end=intervals[0][1];
        
        for(int i=1;i<intervals.length;i++){
            int start=intervals[i][0];
            if(start>=end){ //no overlapping
                end=intervals[i][1];
                count++;
            }
        }
        
        return intervals.length-count;
    }
}