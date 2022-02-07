class Solution {
    public int minSubArrayLen(int x, int[] arr) {
          // Initialize current sum and minimum length
        int curr_sum = 0;
        int n = arr.length;
        int ans = n + 1;
        // Initialize starting and ending indexes
        int start = 0, end = 0;
        boolean fl = false;
        while (end < n) {
            // Keep adding array elements while current sum
            // is smaller than or equal to x
            while (curr_sum < x && end < n)
                curr_sum += arr[end++];
            // If current sum becomes greater than x.
            while (curr_sum >= x && start < n) {
                fl=true;
                // Update minimum length if needed
                ans=Math.min(ans,end-start);
                // remove starting elements
                curr_sum -= arr[start++];
            }
        }
        if(!fl)return 0;
        return ans;
    }
}