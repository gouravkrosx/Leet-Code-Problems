class Solution {
    
  // Best explaination-> 
    // https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/discuss/964331/Intuition-Explained-Simple-Code-O(N)-time-O(1)-space-Java
    
    public int numPairsDivisibleBy60(int[] time) {
   int remainder[]=new int[60];
        int n=time.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int rem=time[i]%60;
            if(rem==0)
                ans+=remainder[0];
            else
                ans+=remainder[60-rem];
            remainder[rem]++;
        }
        return ans;
    }
}

    
    