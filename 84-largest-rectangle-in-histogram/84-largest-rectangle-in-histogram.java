class Solution {
    public int largestRectangleArea(int[] heights) {
        
        int n = heights.length;
        
        long[]right = new long[n];
        
        Stack<Integer>st = new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                right[st.pop()] = i;
            }
            
            st.push(i);
        }
        
        while(!st.isEmpty()){
            right[st.pop()]=n;
        }
        
        long[]left = new long[n];
        
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                left[st.pop()]=i;
            }
            st.push(i);
        }
        
        while(!st.isEmpty()){
            left[st.pop()]=-1;
        }
        
        long area = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            long height = right[i]-left[i]-1;
            long width = heights[i];
            long a = height*width;
            
            area = Math.max(a, area);
        }
        
        return (int)area;
    }
}