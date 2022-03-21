class Solution {
    public int sumSubarrayMins(int[] arr) {
       
        Stack<Integer>st = new Stack<>();
     
        int n = arr.length;
       
    // left is for the distance to previous less element
    // right is for the distance to next less element
        
        int[] left = new int[n];
        int[] right = new int[n];
        
/*        
When Stack is empty, which means there is no previous less element for A[i], in this case, we set left[i] = i+1 by default.
For example [7 8 4 3], there is no PLE for element 4, so left[2] = 2+1 =3.
How many subarrays with 4(A[2]) being its minimum value?
It's left[2]*right[2]=3*1.
So the default value i+1 for left[i] and the default value n-i for right[i] are for counting the subarrays conveniently.
*/
        for(int i=0;i<n;i++)left[i]=i+1;
        for(int i=0;i<n;i++)right[i]=n-i;
        
        
        //prev less elements dis
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                st.pop();
            }
            
            left[i] = (!st.isEmpty())?i-st.peek():i+1;
            st.push(i);
        }
        
        st = new Stack<>();
        //next less elements dis
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                right[st.peek()] = i - st.peek();
                st.pop();
            }
            st.push(i);
        }
        
        long mod = (long) 1000000007;
        long ans = 0;
        for(int i=0;i<n;i++){
            ans = (ans + (long)arr[i]*left[i]*right[i])%mod;
        }
        
        return (int)ans;
    }
}