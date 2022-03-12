class Solution {
/*
Sort cars by the start positions pos
Loop on each car from the end to the beginning
Calculate its time needed to arrive the target
cur records the current biggest time (the slowest)

If another car needs less or equal time than cur,
it can catch up this car fleet.

If another car needs more time,
it will be the new slowest car,
and becomes the new lead of a car fleet.


Complexity:
O(NlogN) Quick sort the cars by position. (Other sort can be applied)
O(N) One pass for all cars from the end to start (another direction also works).

O(N) Space for sorted cars.
O(1) space is possible if we sort pos inplace.   
*/
    
    public int carFleet(int target, int[] position, int[] speed) {
        int n = speed.length;
        //stores pos,time requires to reach target.
        double[][]cars = new double[n][2];
        
        for(int i=0;i<n;i++){
            cars[i]=new double[]{position[i],(double)(target-position[i])/speed[i]};
        }
        
        Arrays.sort(cars,(a,b)->Double.compare(a[0],b[0]));
    
        int res = 0;
        double cur = 0;
        
        for(int i=n-1;i>=0;i--){
            if(cars[i][1]>cur){
                res++;
                cur = cars[i][1];
            }
        }
        return res;
    }
}