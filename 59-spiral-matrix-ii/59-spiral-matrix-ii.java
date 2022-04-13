class Solution {
    public int[][] generateMatrix(int n) {
        int r=n;
        int c=n;
        int minr=0;
        int minc=0;
        int maxr=r-1;
        int maxc=c-1;
        int count=0;
        int nel=r*c;
        
        int[][]matrix = new int[n][n];
        
        while(count<nel){
            
            for(int col=minc;col<=maxc && count<nel;col++){
                matrix[minr][col]=count+1;
                count++;
            }
            
            minr++;
            
            for(int row=minr;row<=maxr && count<nel;row++){
                matrix[row][maxc]=count+1;
                count++;
            }
            maxc--;
            
            for(int col=maxc;col>=minc && count<nel;col--){
                matrix[maxr][col]=count+1;
                count++;
            }
            maxr--;
            
            for(int row=maxr;row>=minr && count<nel;row--){
                matrix[row][minc]=count+1;
                count++;
            }
            minc++;
        }
        return matrix;
    }
}