// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String s = in.readLine();
            
            Solution ob = new Solution();
            System.out.println(ob.decodedString(s));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    static String decodedString(String s){
     Stack<Character> st = new Stack<>();
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < ch.length; i++) {
			char c = ch[i];
			if (Character.isDigit(c) || Character.isAlphabetic(c) || c == '[') {
				st.push(c);
			} else {
				while (st.peek() != '[') {
					sb.insert(0, st.pop());
				}

				st.pop();

			    String cs="";
			    while(!st.isEmpty() && Character.isDigit(st.peek())){
			        cs = st.pop()+cs;
			    }
			    int count = Integer.parseInt(cs);
                count--;

				String str = sb.toString();
                
				while (count-- > 0) {
					sb.append(str);
				}
				for (char cc : sb.toString().toCharArray()) {
					st.push(cc);
				}
					sb = new StringBuilder();
			}
		}
		while(!st.isEmpty())sb.append(st.pop());
		
		return sb.reverse().toString();
    }
}