class Solution {
    public String minRemoveToMakeValid(String s) {
        HashMap<Integer,Integer>map = new HashMap<>();
        
        Stack<int[]>st = new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(Character.isAlphabetic(ch)){
                continue;
            }
            
            if(ch=='('){
                map.put(i,0);
                st.push(new int[]{i,0});
            }else{
                map.put(i,1);
                if(!st.isEmpty() && st.peek()[1]==0){
                    st.pop();
                }else{
                    st.push(new int[]{i,1});
                }
            }
        }
        
        while(!st.isEmpty()){
            map.remove(st.pop()[0]);
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            
            if(Character.isAlphabetic(ch)){
                sb.append(ch);
                continue;
            }
            
            if(map.containsKey(i)){
                sb.append(ch);
            }
        }
        
        return sb.toString();
    }
}