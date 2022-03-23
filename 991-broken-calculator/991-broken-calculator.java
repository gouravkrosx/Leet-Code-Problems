class Solution {
    public int brokenCalc(int x, int y) {
// Proof of Greedy: https://leetcode.com/problems/broken-calculator/discuss/236565/Detailed-Proof-Of-Correctness-Greedy-Algorithm
        
        int count=0;
        
        while(y!=x){
            
            if(x>=y)return count + (x-y);
            
            if(y%2==0){
                y=y/2;
            }else
                y++;
            
            count++;
        }
        return count;
    }
}