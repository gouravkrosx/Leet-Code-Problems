class Solution {
//Idea: Basically checking from end so that you take max value character and at last you only need to take less value character which leads to smallest string in lexicographically order.    
    public String getSmallestString(int n, int k) {
       
        StringBuilder sb = new StringBuilder();
        
        while(k>0){
            // consider that _ _ _ _ at the 4th place you want to put a character, for this you also consider for
            // 0-3 characters, assume you put only a there which has 1 value so so won't take any character if its
            // greater than equal to current k value, along with this you also take prev characters acc
            // that's why (k-(n-1)).
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