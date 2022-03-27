class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->(a[0]==b[0])?a[1]-b[1]:a[0]-b[0]);
        
        for(int i=0;i<mat.length;i++){
            int soldier = 0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1){
                    soldier++;
                }else
                    break;
            }
            pq.add(new int[]{soldier,i});
        }
        
        int[]res = new int[k];
        int idx=0;
        while(k-->0){
            res[idx++]=pq.poll()[1];
        }
        return res;
    }
}