class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][]arr = new int[m][n];
        
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                int cnt = collect(board,i,j,m,n);
                
                if(board[i][j]==0){
                    if(cnt==3){
                        arr[i][j]=1;
                    }
                }else{
                    if(cnt==2||cnt==3){
                        arr[i][j]=1;
                    }
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=arr[i][j];
            }
        }
    }
    public int collect(int[][]board,int r,int c,int m,int n){
        int cnt=0;
        int[][]dir = {{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1},{-1,0},{-1,1}};
        
        for(int i=0;i<dir.length;i++){
            int x = r + dir[i][0];
            int y = c + dir[i][1];
            
            if(x<0|| x>=m || y<0 || y>=n)continue;
            if(board[x][y]==1)cnt++;
        }
        return cnt;
    }
}