class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
         List<List<Integer>> ans = new ArrayList<>();
        int row = grid.length;
        int col = grid[0].length;
        int elements = row * col;
        List<Integer> list = new ArrayList<>();
        k = k % elements;
        for(int i=elements-k;i<elements*2-k;i++){
            list.add(grid[(i%elements)/col][(i%elements)%col]);
            if(list.size()%col==0){
                ans.add(list);
                list = new ArrayList<>();
            }
        }
        return ans;
    }
}