class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        boolean[]isNotRoot = new boolean[n];
        
        for(int l:leftChild){
            if(l!=-1)isNotRoot[l]=true;
        }
        
        for(int r:rightChild){
            if(r!=-1)isNotRoot[r]=true;
        }
        
        int root=-1;
        
        for(int i=0;i<n;i++){
            if(!isNotRoot[i]){
                if(root!=-1)return false; 
                root = i;
            }
        }
        
        if(root==-1)return false;
        
        Queue<Integer>q = new LinkedList<>();
        boolean[]vis = new boolean[n];
        q.add(root);
        
        vis[root]=true;
        
        int count=0;
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0;i<size;i++){
                int node = q.remove();
                
                count++;
                
                if(leftChild[node]!=-1){
                    if(vis[leftChild[node]])return false;
                    vis[leftChild[node]]=true;
                    q.add(leftChild[node]);
                }
                
                if(rightChild[node]!=-1){
                    if(vis[rightChild[node]])return false;
                    vis[rightChild[node]]=true;
                    q.add(rightChild[node]);
                }
            }
        }
        return count==n;
    }
}