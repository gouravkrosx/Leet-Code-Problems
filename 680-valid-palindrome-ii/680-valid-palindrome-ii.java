class Solution {
    public boolean validPalindrome(String s) {
       
        int l = 0;
        int r = s.length()-1;
        
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                break;
            }
            l++;
            r--;
        }
        if(l>=r || l+1==r)return true;
        
        return isPalindrome(s.substring(l,r)) || isPalindrome(s.substring(l+1,r+1));
    }
    public boolean isPalindrome(String s){
        int l = 0;
        int r = s.length()-1;
        
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}