class Solution {
   
    /*
    
    The basic idea is that, for example, nums = [1,2,3,4,5,6,7] and k = 3, first we reverse [1,2,3,4], it becomes[4,3,2,1]; then we reverse[5,6,7], it becomes[7,6,5], finally we reverse the array as a whole, it becomes[4,3,2,1,7,6,5] ---> [5,6,7,1,2,3,4].

Reverse is done by using two pointers, one point at the head and the other point at the tail, after switch these two, these two pointers move one position towards the middle.


    
    */
    
    public void rotate(int[] nums, int k) {
        
        int n = nums.length;
        
        k = k % n;
        
       reverse(nums,0,n-k-1);
       reverse(nums,n-k,n-1);
       reverse(nums,0,n-1); 
    }
    public void reverse(int[]nums,int l,int h){
        while(l<h){
            
            int temp = nums[l];
            nums[l]=nums[h];
            nums[h]=temp;

            l++;
            h--;
        }
    }
}