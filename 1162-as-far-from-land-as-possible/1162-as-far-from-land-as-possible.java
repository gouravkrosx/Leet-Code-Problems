class Solution {
// Logic:      
    public int maxDistance(int[][] grid) {
        
        int n = grid.length;
        int m = grid[0].length;
        
        Queue<int[]>q = new LinkedList<>();
        boolean vis[][] = new boolean[n][m];
        int[][]dp = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                    q.add(new int[]{i,j});
                    vis[i][j] = true;
                }
            }
        }
        
        int max = -1;
        boolean allOnes = true;
        int[][]direction = {{0,1},{1,0},{0,-1},{-1,0}};
        
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[]arr = q.poll();
                int r = arr[0];
                int c = arr[1];
                for(int dir=0;dir<4;dir++){
                    int nr = r + direction[dir][0];
                    int nc = c + direction[dir][1];
                 
                     if(isValid(vis,nr,nc)){
                        int dis = getDis(r,c,nr,nc);
                         
                        dp[nr][nc] = dis + dp[r][c];
                         
                        max = Math.max(dp[nr][nc],max); 
                        vis[nr][nc]=true;
                        q.add(new int[]{nr,nc});
                    }
                }
            }
        }
        return max;
    }
    public boolean isValid(boolean[][]vis,int i,int j){
        if(i<0||i>=vis.length||j<0||j>=vis[0].length||vis[i][j])return false;
        return true;
    }
    public int getDis(int i1,int j1,int i2,int j2){
        return (Math.abs(i1-i2)+Math.abs(j1-j2));
    }
}