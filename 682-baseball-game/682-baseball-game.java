class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer>st = new Stack<>();
        
        for(int i=0;i<ops.length;i++){
            String str = ops[i];
            
           if(str.charAt(0)=='C'){
               st.pop();
           }else if(str.charAt(0)=='D'){
               st.push(2*st.peek());
           }else if(str.charAt(0)=='+'){
               int a = st.pop();
               int b = st.pop();
               int c = a+b;
               st.push(b);
               st.push(a);
               st.push(c);
           }else{
               st.push(Integer.parseInt(str));
           }
        }
        
        int sum = 0;
        
        while(!st.isEmpty()){
            sum+=st.pop();
        }
         return sum;   
    }
}