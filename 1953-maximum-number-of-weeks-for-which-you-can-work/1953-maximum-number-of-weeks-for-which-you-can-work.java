class Solution {
    public long numberOfWeeks(int[] milestones) {
     
       long sum = 0;
       long max = -1;
        for(int stones:milestones){
            sum+=stones;
            max = Math.max(max,stones);
        }
        //if sum of all the milestones of projects except maximum one + 1 <=  milestones in max project
        // it means that all the milestones can be covered.
        // but if not than max project milestones - sum(except max one)-1 can be done.
        long x = sum-max;
        
        if(x+1>=max)return sum;
        else return 2*x+1;
        
    }
}