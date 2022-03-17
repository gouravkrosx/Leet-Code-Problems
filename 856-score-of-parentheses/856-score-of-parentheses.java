class Solution {
    public int scoreOfParentheses(String s) {
        Stack<String>st = new Stack<>();
        
        char[]crr = s.toCharArray();
        for(int i=0;i<crr.length;i++){
            if(crr[i]=='('){
                st.push("(");
            }else{
                if(st.peek()=="("){
                    st.pop();
                    st.push("1");
                    continue;
                }
                
                int num = 0;
                while(!st.isEmpty() && st.peek()!="("){
                    num+=Integer.parseInt(st.pop());
                }
                st.pop();
                st.push(2*num+"");
            }
        }
        int res = 0;
        
        while(!st.isEmpty()){
            res+=Integer.parseInt(st.pop());
        }
        return res;
    }
}