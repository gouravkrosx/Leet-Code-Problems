class Solution {
   public int swimInWater(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int n = grid.length;
        int start = grid[0][0];
        int end = n * n - 1;
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        
       int ans=0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int[][] visited = new int[n][n];
            if (possible(grid, mid, 0, 0, dx, dy, visited)) {
                ans = mid;
                end = mid-1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    private boolean possible(int[][] grid, int cur, int x, int y, int[] dx, int[] dy, int[][] visited) {
        visited[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 && newY >= 0 && newX < grid.length && newY < grid[0].length && visited[newX][newY] == 0 && cur >= grid[newX][newY]) {
                if (newX == grid.length - 1 && newY == grid[0].length - 1) {
                    return true;
                }
                if (possible(grid, cur, newX, newY, dx, dy, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

}