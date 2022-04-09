class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='O'){
                    board[i][j]='G';
                }
            }
        }
        
        // flood filling
        boolean[][]vis = new boolean[m][n];
        
        //first row
        for(int i=0;i<n;i++)
            floodfill(board,vis,'O',0,i,m,n);
        
        //last row
        for(int i=0;i<n;i++)
            floodfill(board,vis,'O',m-1,i,m,n);
            
            
        //first column
        for(int i=0;i<m;i++)
            floodfill(board,vis,'O',i,0,m,n);
            
            
        //last column    
        for(int i=0;i<m;i++)
            floodfill(board,vis,'O',i,n-1,m,n);
        
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]=='G'){
                    board[i][j]='X';
                }
            }
        }
    }
    public void floodfill(char[][]board,boolean[][]vis,char ch,int r,int c,int m,int n){
        if(r<0 || r>=m || c<0 || c>=n || board[r][c]=='X' || vis[r][c]) return;
        
        vis[r][c]=true;
        
        if(board[r][c]=='G'){
            board[r][c]=ch;
        }
        
        int[][]dir = {{1,0},{0,1},{-1,0},{0,-1}};
        
        for(int i=0;i<dir.length;i++){
            floodfill(board,vis,ch,r+dir[i][0],c+dir[i][1],m,n);    
        }
    }
}