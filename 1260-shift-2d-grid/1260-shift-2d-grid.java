class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        
        k = k%(m*n);
        
        List<Integer>list = new ArrayList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                list.add(grid[i][j]);
            }
        }
        
        reverse(list,0,(m*n)-k-1);
        reverse(list,(m*n)-k,(m*n)-1);
        reverse(list,0,(m*n)-1);
        
        List<List<Integer>>ans = new ArrayList<>();
        
        int id = 0;
        while(id<(m*n)){
            List<Integer>temp = new ArrayList<>();
            int jd = 0;
            while(jd<n){
                temp.add(list.get(id+jd));
                jd++;
            }
            id+=n;
            ans.add(temp);
        }
        return ans;
    }
    public void reverse(List<Integer>list,int l,int h){
              
        while(l<h){
            int a = list.get(l);
            int b = list.get(h);
            list.set(l,b);
            list.set(h,a);
            l++;
            h--;
        }
    }
}