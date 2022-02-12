class Solution {
    public String removeKdigits(String num, int k) {
    Deque<Integer> st = new LinkedList<>();

		for (int i = 0; i < num.length(); i++) {
			int val = num.charAt(i) - '0';
			while (!st.isEmpty() && st.peekLast() > val && k > 0) {
				st.pollLast();
				k--;
			}
			st.addLast(val);
		}
        while(!st.isEmpty() && k>0){
            st.pollLast();
            k--;
        }
        
		StringBuilder sb = new StringBuilder();
		while (!st.isEmpty()) {
			int val = st.pollFirst();
			if (val == 0 && sb.length() == 0)
				continue;
			sb.append(val);
		}
        if(sb.length()==0)return "0";
		return sb.toString();
    }
}