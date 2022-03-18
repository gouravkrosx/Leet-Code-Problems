class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character>st = new Stack<>();
        
        HashMap<Character,Integer>map = new HashMap<>();
        Set<Character>set = new HashSet<>();
        
        for(char ch:s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
                       
            if(set.contains(ch)){
                map.put(ch,map.get(ch)-1);
                continue;
            }
            
            while(!st.isEmpty() && st.peek()>ch && map.get(st.peek())>1){                
                map.put(st.peek(),map.get(st.peek())-1);
                set.remove(st.pop());
            }
            set.add(ch);
            st.push(ch);
        }
        
        StringBuilder sb = new StringBuilder();
        
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        return sb.reverse().toString();
    }
}