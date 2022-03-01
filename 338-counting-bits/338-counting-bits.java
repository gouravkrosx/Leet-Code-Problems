class Solution {
    public int[] countBits(int n) {
        // https://leetcode.com/problems/counting-bits/discuss/79557/How-we-handle-this-question-on-interview-Thinking-process-%2B-DP-solution
    
        // O(N) <- there is a pattern just dry run to understand and also see the above discussion
        
        int[]res = new int[n+1];
        
        int offset=1;
        
        for(int index=1;index<n+1;index++){
            if(offset*2==index){
                offset*=2;
            }
            res[index]=res[index-offset]+1;
        }
        
        return res;
    }
}