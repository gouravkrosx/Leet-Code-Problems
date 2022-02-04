class Solution {
    public String simplifyPath(String path) {
      if (path.charAt(0) != '/')
			return "";
        
        
		int n = path.length();
		Stack<Character> st = new Stack<>();
		// System.out.println(path);
		int i = 0;
		while (i < n) {
			char ch = path.charAt(i);
			// System.out.println(ch);
			if (ch == '/') {
				if (st.isEmpty() || st.peek() != '/') {
					st.push(ch);
				}
			} else if (Character.isLetterOrDigit(ch) || ch == '_') {
				st.push(ch);
			} else if (ch == '.') {
				int count = 1;
				while (i + 1 < n && path.charAt(i + 1) == '.') {
					count++;
					i++;
				}
                
                if(i+1<n && path.charAt(i+1)!='/'){
                    while (count-- > 0) {
						st.push('.');
					}
                }else{
                        if (st.peek() != '/' || count > 2) {
                        while (count-- > 0) {
                            st.push('.');
                        }
                    } else {
                        if (count == 2) {
                            st.pop();
                            while (!st.isEmpty() && st.peek() != '/') {
                                st.pop();
                            }
                        }
                    }   
                }
			}

			i++;
		}
        
        if(st.size()==1 && st.peek()=='/' || st.isEmpty()){
            return "/";
        }
        
		if (st.peek() == '/')
			st.pop();
        
		StringBuilder sb = new StringBuilder();

		while (!st.isEmpty()) {
			sb.append(st.pop());
		}

		return sb.reverse().toString();
    }
}