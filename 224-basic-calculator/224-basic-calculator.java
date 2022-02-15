class Solution {
    public int calculate(String s) {
        
       int res=0,sign=1;
       Stack<Integer>st = new Stack<>();
        
       int n=s.length();
       char[] crr = s.toCharArray();
        
       for(int i=0;i<n;i++){
           char ch = crr[i];
           
           if(Character.isDigit(ch)){
               int num = ch-'0';
               while(i+1<n && Character.isDigit(crr[i+1])){
                   num = num*10 + crr[i+1]-'0';
                   i++;
               }
               res += num * sign;
           }else if(ch=='+'){
               sign=1;
           }else if(ch=='-'){
               sign=-1;
           }else if(ch=='('){
               st.push(res);
               st.push(sign);
               res=0; // to get the new number inside the parenthesis.
               sign=1;
           }else if(ch==')'){
               res = res * st.pop() + st.pop();
           }
       } 
       return res; 
    }
}