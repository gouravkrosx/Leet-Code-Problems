class Solution {
// Logic: Think problem backward, and apply bfs from all the lands at the same time.
// and see how far it can go.    
    public int maxDistance(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<int[]>q = new LinkedList<>();
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                }
            }
        }
        
        if(q.size()==n*m)return -1;
        
        int max = -1;

        int[][]direction = {{0,1},{1,0},{0,-1},{-1,0}};
        
        while(!q.isEmpty()){
            max++;
            int size = q.size();
            
            for(int i=0;i<size;i++){
                int[]arr = q.poll();
                int r = arr[0];
                int c = arr[1];
                for(int dir=0;dir<4;dir++){
                    int nr = r + direction[dir][0];
                    int nc = c + direction[dir][1];
                 
                     if(isValid(grid,nr,nc)){
                        grid[nr][nc]=1;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return max;
    }
    public boolean isValid(int[][]grid,int i,int j){
        if(i<0||i>=grid.length||j<0||j>=grid[0].length||grid[i][j]==1)return false;
        return true;
    }
}