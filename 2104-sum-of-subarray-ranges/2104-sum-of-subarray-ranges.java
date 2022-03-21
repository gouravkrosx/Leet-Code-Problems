class Solution {
    public long subArrayRanges(int[] nums) {
         int n = nums.length;
        long sum=0;
        Stack<Integer> st = new Stack<>();
        int[] minPrev = new int[n];
        int[] minNext = new int[n];
        int[] maxPrev = new int[n];
        int[] maxNext = new int[n];
        
        Arrays.fill(minPrev , -1);
        Arrays.fill(minNext , n);
        Arrays.fill(maxPrev , -1 );
        Arrays.fill(maxNext , n);
        
        
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                minPrev[i] = st.peek();
            }
            
            st.push(i);
        }
        
        st = new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()] > nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                minNext[i] = st.peek();
            }
            st.push(i);
        }
        
        st = new Stack<>();
        for(int i=0 ;i<n ;i++){
            while(!st.isEmpty() && nums[st.peek()] <= nums[i]){
                st.pop();
            }
            if(!st.isEmpty()){
                maxPrev[i] = st.peek();
            }
            st.push(i);
        }
        
        st = new Stack<>();
        for(int i=n-1 ; i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()] < nums[i]){
                st.pop();
            }
            
            if(!st.isEmpty()){
                maxNext[i] = st.peek();
            }
            
            st.push(i);
        }
        
        
        for(int i=0 ;i <n;i++){
            long leftMin = i-minPrev[i];
            long rightMin = minNext[i]-i;
            long leftMax = i-maxPrev[i];
            long rightMax = maxNext[i]-i;
            sum+= (leftMax*rightMax - leftMin*rightMin)*nums[i];
        }
        
        return sum;
    }
}