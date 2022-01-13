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
    public int findMinArrowShots(int[][] points) {
         if(points.length==0)return 0;
        
       int count = 0;
        long end = Long.MIN_VALUE;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1],b[1]));

        for(int[] p: points){
            if(p[0] > end){
                end = p[1];
                count++;
            }
        }

        return count;
    }
}
