class Solution {
    public int longestSubstring(String s, int k) {
       
       int n = s.length();
       int max = 0;
       int[] cnt = new int[26];
        
        for(int u=1;u<=26;u++){
            
            Arrays.fill(cnt,0);
            int unique = 0;
            int kOrMore = 0;
            int left = 0;
            int right = 0;
            
            while(right<n){
                if(unique<=u){
                    char ch = s.charAt(right);
                    cnt[ch-'a']++;
                    if(cnt[ch-'a']==1)unique++;
                    
                    if(cnt[ch-'a']==k)kOrMore++;
                    right++;
                }else{
                    char ch = s.charAt(left);
                    if(cnt[ch-'a']==1)unique--;
                    
                    if(cnt[ch-'a']==k)kOrMore--;
                    
                    cnt[ch-'a']--;
                    left++;
                }
                if(unique==u && unique==kOrMore){
                    max = Math.max(max,right-left);
                }
            }
        }
        return max;
    }
}