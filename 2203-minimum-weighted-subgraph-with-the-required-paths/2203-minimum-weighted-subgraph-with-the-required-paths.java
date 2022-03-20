class Solution {
    public long minimumWeight(int n, int[][] edges, int src1, int src2, int dest) {
        
        List<List<pair>>graph = new ArrayList<>();
        List<List<pair>>revGraph = new ArrayList<>();
        
        makeGraph(graph,revGraph,edges,n);
            
       long[]da = new long[n]; //from src1 to all nodes;
       long[]db = new long[n];
       long[]dd = new long[n];
       
        long infi = Long.MAX_VALUE;

        Arrays.fill(da,infi);
        Arrays.fill(db,infi);
        Arrays.fill(dd,infi);
        
        dijkstra(graph,src1,da);
        dijkstra(graph,src2,db);
        dijkstra(revGraph,dest,dd);
        
        long ans = Long.MAX_VALUE;
        
        for(int i=0;i<n;i++){
            if(da[i]!=infi && db[i]!=infi && dd[i]!=infi){
                ans = Math.min(ans,da[i]+db[i]+dd[i]);
            }
        }

        return (ans==Long.MAX_VALUE)?-1:ans;
    }
    
    public void dijkstra(List<List<pair>>adj,int src,long[]dis){
        
        PriorityQueue<pair>pq = new PriorityQueue<>((a,b)->Long.compare(a.weight,b.weight));      
        
        dis[src] = 0;
        
        pq.add(new pair(src,0));
        while(!pq.isEmpty()){
            pair rp = pq.poll();
            
            if(dis[rp.node]<rp.weight)continue; //this prevents TLE
            
            for(pair ap:adj.get(rp.node)){
                if(dis[rp.node]+ap.weight<dis[ap.node]){
                    dis[ap.node] = dis[rp.node]+ap.weight;
                    pq.add(new pair(ap.node,dis[ap.node]));
                }
            }
        }
    }
    
    public void makeGraph(List<List<pair>>graph,List<List<pair>>revGraph,int[][]edges,int n){
        
        for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
            revGraph.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int[]edge = edges[i];
            pair p1 = new pair(edge[1],edge[2]);
            pair p2 = new pair(edge[0],edge[2]);
            
            graph.get(edge[0]).add(p1);
            revGraph.get(edge[1]).add(p2);
        }
    }
    class pair{
        int node;
        long weight;
        public pair(int n,long w){
            node=n;
            weight=w;
        }
    }
}