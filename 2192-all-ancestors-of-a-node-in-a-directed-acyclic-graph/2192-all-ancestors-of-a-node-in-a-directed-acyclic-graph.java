class Solution {
   public static List<List<Integer>> getAncestors(int n, int[][] edges) {
		List<List<Integer>> adj = makeGraph(n, edges);

		List<List<Integer>>ans = new ArrayList<>();
        
       
        for(int i=0;i<n;i++){
               int[]vis=new int[n];
                List<Integer>temp = new ArrayList<>();
                Dfs(i,i,adj,temp,vis);
                Collections.sort(temp);
                ans.add(temp);
            
        }
        
		return ans;
	}
    public static void Dfs(int node,int source,List<List<Integer>>adj,List<Integer>list,int[]vis){
       vis[node]=1; 
        
        if(node!=source)list.add(node);
        
        for(int an:adj.get(node)){
            if(vis[an]==0){
                vis[an]=1;
                Dfs(an,source,adj,list,vis);
            }
        }
    }

	public static List<List<Integer>> makeGraph(int n, int[][] edges) {
		List<List<Integer>> adj = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			adj.add(new ArrayList<>());
		}

		for (int i = 0; i < edges.length; i++) {
			int u = edges[i][0];
			int v = edges[i][1];

			adj.get(v).add(u);
		}
		return adj;
	}
}