class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;
        
        return solve(matrix,0,0,m-1,n-1,target);
    }
    
    public boolean solve(int[][]matrix,int cr,int cc,int er,int ec,int target){
        if(cr>er || cc>ec || cc>matrix[0].length || cr>matrix.length || er<0 || ec<0 ){
            return false;
        }
        
        int mr = (cr+er)/2;
        int mc = (cc+ec)/2;
        
        if(matrix[mr][mc]==target)return true;
        
        if(matrix[mr][mc]<target){
            return solve(matrix,mr+1,cc,er,ec,target) || solve(matrix,cr,mc+1,er,ec,target);
        }
        
        return solve(matrix,cr,cc,mr-1,ec,target) || solve(matrix,cr,cc,er,mc-1,target); 
    }
}
