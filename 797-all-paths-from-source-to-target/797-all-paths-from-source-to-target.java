class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>>adj = new ArrayList<>();
        
        int n = graph.length;
        
        for(int i = 0; i < n ; i++){
            adj.add(new ArrayList<>());    
        }
        
        for(int i = 0; i < n ; i++){
            for(int node:graph[i]){
                adj.get(i).add(node);
            }
        }
     
        List<List<Integer>>ans = new ArrayList<>();
        
        boolean[]vis = new boolean[n];
        
        List<Integer>list = new ArrayList<>();
        list.add(0);
        
        dfs(adj,0,n,vis,list,ans);
        return ans;
    }
    public void dfs(List<List<Integer>>adj,int node,int n,boolean[]vis,List<Integer>list,List<List<Integer>>ans){
        if(node==n-1){
            // list.add(n-1);
            ans.add(new ArrayList<>(list));
            return;
        }
        
        for(int an:adj.get(node)){
            if(!vis[an]){
                list.add(an);
                vis[an]=true;
                dfs(adj,an,n,vis,list,ans);
                 vis[an]=false;
                list.remove(list.size()-1);
            }
        }
    }
}