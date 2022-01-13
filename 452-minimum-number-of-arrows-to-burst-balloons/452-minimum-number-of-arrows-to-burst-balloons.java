class Solution {

    /*
    
    A very easy and straight forward solution with proof
step 1: Sort intervals/pairs in increasing order of the start position
step 2: finding the common area of current interval with start and end,if they intersect....(for example { [1,6] , [2,8] } these intervals intersect common area is [2,6])
step 3: else if no common area update start and end to current interval and increment arrow count

PROOF for updating start and end if there is no common area:
--> As the intervals are sorted in increasing order and if there is no comman area in current interval and {start,end} there is no point of upcoming intervals/pairs intersect or have
common area with {start,end} which is previous interval.
    
    */
    public int findMinArrowShots(int[][] intervals) {
         if(intervals.length==0)return 0;
        
        Arrays.sort(intervals,(int[]a,int[]b) ->Integer.compare(a[0],b[0])); //sorting with increasing start time
        
        int count=1;
        int end=Integer.MAX_VALUE;
        
        for(int i=0;i<intervals.length;i++){
            int start=intervals[i][0];
            if(start>end){ //no overlapping
                end=intervals[i][1];
                count++;;
            }else{
               end=Math.min(end,intervals[i][1]); 
            }
        }
        
        return count;
    }
}
