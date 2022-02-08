class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        
        int i=0,j=0;
        Set<Character>set = new HashSet<>();
        
        int res=0;
        
        while(j<n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                res = Math.max(res,j-i+1);
                j++;
            }else{
                while(set.contains(ch) && i<j){
                    set.remove(s.charAt(i));
                    i++;
                }
            }
        }
        return res;
    }
}