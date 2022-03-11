class Solution {
    public int[][] diagonalSort(int[][] mat) {
        HashMap<Integer,PriorityQueue<Integer>> d = new HashMap<>();
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                d.putIfAbsent(i-j,new PriorityQueue<>());
                d.get(i-j).add(mat[i][j]);
            }
        }
        
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                mat[i][j]=d.get(i-j).poll(); 
                //this way getting minimum element each time using PriorityQueue
            }
        }
        return mat;
    }
}