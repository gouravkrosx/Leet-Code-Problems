class Solution {
    public int[] distributeCandies(int candies, int num) {
        int[]res = new int[num];
        
        for(int i=0;candies>0;i++){
            res[i%num]+=Math.min(candies,i+1);
            candies-=i+1;
        }
        return res;
    }
}