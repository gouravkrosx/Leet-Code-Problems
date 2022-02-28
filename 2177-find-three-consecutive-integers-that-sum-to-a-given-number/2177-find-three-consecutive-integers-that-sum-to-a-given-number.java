class Solution {
    public long[] sumOfThree(long num) {
        // x-1,x,x+1 can be the 3 consecutive numbers.
        if(num%3!=0)return new long[]{};
        
        long x = num/3;
        return new long[]{x-1,x,x+1};
    }
}