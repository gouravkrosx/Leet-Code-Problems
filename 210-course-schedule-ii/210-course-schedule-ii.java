class Solution {
    public int[] findOrder(int numCourses, int[][] edges) {
        ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        
      ArrayList<Integer> topo = new ArrayList<>();
		int[] indegree = new int[numCourses];

		for (int i = 0; i < numCourses; i++) {
			for (int an : adj.get(i)) {
				indegree[an]++;
			}
		}

		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i< numCourses; i++) {
			if (indegree[i] == 0)
				q.add(i);
		}

        int res[] = new int[numCourses];
        int i=0;
        int count=0;
		while (!q.isEmpty()) {
			int rn = q.poll();
			res[i++]=rn;
            count++;
			for (int an : adj.get(rn)) {
				indegree[an]--;
				if (indegree[an] == 0) {
					q.add(an);
				}
			}
		}
        if(count!=numCourses){
            return new int[]{};
        }
		return res;
    }
    public boolean DfsTopo(Stack<Integer>st,ArrayList<ArrayList<Integer>>adj,boolean[]vis,int node,boolean[]dfs){
        vis[node]=true;
        dfs[node]=true;
        
        for(int an:adj.get(node)){
            if(!vis[an]){
                if(DfsTopo(st,adj,vis,an,dfs)){
                    return true;
                }
            }else if(dfs[node]==true){
                return true;
            }
        }
        st.add(node);
        dfs[node]=false;
        return false;
    }
}