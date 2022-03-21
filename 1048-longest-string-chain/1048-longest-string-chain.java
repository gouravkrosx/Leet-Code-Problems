class Solution {
    public int longestStrChain(String[] words) {
        HashMap<String,Integer>dp = new HashMap<>();
        Arrays.sort(words,(a,b)->(a.length()-b.length()));
        
        int ans=0;
        
        for(String word:words){
            int best = 0;
            
            for(int i=0;i<word.length();i++){
                String prev = word.substring(0,i) + word.substring(i+1);
                best = Math.max(best,dp.getOrDefault(prev,0)+1);
            }
            dp.put(word,best);
            ans = Math.max(ans,best);
        }
        return ans;
    }
}