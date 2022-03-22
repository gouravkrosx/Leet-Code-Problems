class Solution {
    public String getSmallestString(int n, int k) {
       
        StringBuilder sb = new StringBuilder();
        
        while(k>0){
            if(k-(n-1)>=26){
                sb.append("z");
                k-=26;
            }else{
                char ch = (char)('a'+(k-(n-1)-1));
                sb.append(ch);
                k = n-1;
            }
            n--;              
        }
        
        return sb.reverse().toString();
    }
}