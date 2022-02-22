class Solution {
    public int titleToNumber(String col) {
        int ans=0;
        long multiplier=1;
        for(int i=col.length()-1;i>=0;i--){
            int ch = (col.charAt(i)-'A'+1);
            ans+=ch*multiplier;
            multiplier*=26;
        }
        return ans;
    }
}