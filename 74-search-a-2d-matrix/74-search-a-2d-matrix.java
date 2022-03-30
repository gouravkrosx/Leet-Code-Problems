class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
      if(arr.length==0){
          return false;
      }
        
        int n=arr.length;
        int m=arr[0].length;
        int low=0;
        int high=n*m-1;
   //we will use binary search as usual taking 2d array indexes and then convert the row and column indexes corresponding to their mid index.         
        while(low<=high){
           int mid=(low+high)/2;
            if(arr[mid/m][mid%m]==target){
                return true;
            }
            
            if(arr[mid/m][mid%m]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
            
        return false;
    }
}