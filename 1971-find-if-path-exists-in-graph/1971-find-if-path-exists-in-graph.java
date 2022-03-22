class Solution {
    
    
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        makeSet(n);
        
        for(int i=0;i<edges.length;i++){
            union(edges[i][0],edges[i][1]);
        }
        
        return (findParent(source)==findParent(destination));
    }
   
    int[]parent;
    int[]rank;
    
    public void makeSet(int n){
        parent = new int[n];
        rank = new int[n];
        
        for(int i=0;i<n;i++){
            parent[i]=i;
            rank[i]=1;
        }
    }
    
    public int findParent(int node){
        if(node==parent[node]){
            return node;
        }
        
        return parent[node]=findParent(parent[node]);
    }
    
    public void union(int u,int v){
        u = findParent(u);
        v = findParent(v);
        
        if(rank[u]>rank[v]){
            parent[v] = u;
            rank[u]+=rank[u];
        }else{
            parent[u] = v;
            rank[v]+=rank[u]; 
        }
    }
}