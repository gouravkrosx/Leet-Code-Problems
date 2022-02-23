class Solution {
    public int minAddToMakeValid(String str) {
     
         Stack<Character>st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else{
                    st.push(ch);
                }
            }
        }
        return st.size();
    }
}