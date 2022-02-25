class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int only=0;
        int len=0;
        for(int val:map.values()){
            if(val%2!=0){
                if(only==0){
                    only=1;
                    len+=val;
                }else{
                    len+=val-1;
                }  
            }else{
                len+=val;
            }
        }
        return len;
    }
}