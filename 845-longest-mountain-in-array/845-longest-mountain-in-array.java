class Solution {
   public int longestMountain(int[] A) {
        int n=A.length;
        if(n<3)return 0;
        
        int left=0;int right;int max=0;
        
        while(left<n-2){
            //skip decending and equal array
            while(left<n-1 && A[left]>=A[left+1]){
                left++;
            }
            right=left+1;
            //mountain up
            while(right<n-1 && A[right]<A[right+1]){
                right++;
            }
            //mountain down
            while(right<n-1 && A[right]>A[right+1]){
                right++;
                //update the max value
                max=Math.max(max,right-left+1);
            }
            left=right;
        }
        return max;
    }
}