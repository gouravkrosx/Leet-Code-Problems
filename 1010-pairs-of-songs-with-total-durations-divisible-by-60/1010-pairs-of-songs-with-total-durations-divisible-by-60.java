class Solution {
    public int numPairsDivisibleBy60(int[] time) {
    if(time.length<=1)return 0;
        
    int ans = 0;
        
    Map<Integer,Integer>count = new HashMap<>();     
        
    for (int t : time) {
    int reducedTime = t % 60;
    int other = (reducedTime == 0) ? 0 : 60 - reducedTime;
    ans += count.getOrDefault(other, 0);
    count.put(reducedTime, count.getOrDefault(reducedTime, 0) + 1);
   }
        
        return ans;
    }
}

    
    