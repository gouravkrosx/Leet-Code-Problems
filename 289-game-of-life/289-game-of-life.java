class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][]arr = new int[m][n];
        
        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                int alive = collect(board,i,j,m,n);
    
                // Dead cell with 3 live neighbors becomes alive
			if (board[i][j] == 0 && alive == 3) // board[i][j] = 00
				board[i][j] = 2; // board[i][j] = 10
			// Live cell with 2 or 3 live neighbors lives on
			else if (board[i][j] == 1 && (alive == 2 || alive == 3)) // board[i][j] = 01
				board[i][j] = 3; // board[i][j] = 11              
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j]=(board[i][j]>>1);
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
            if((board[x][y]&1)==1)cnt++;
        }
        return cnt;
    }
}