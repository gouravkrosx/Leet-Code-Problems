class Solution {
    int m = (int)1e9+7;
    public int countPaths(int n, int[][] roads) {
        
        List<List<City>>adj = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        
        for(int i=0;i<roads.length;i++){
            int u = roads[i][0];
            int v = roads[i][1];
            int t = roads[i][2];
            adj.get(u).add(new City(v,t));
            adj.get(v).add(new City(u,t));
        }
        
        int[]ways = new int[n];
        int[]dis = new int[n];

        Arrays.fill(dis,Integer.MAX_VALUE);
        ways[0]= 1;
        dis[0] = 0;
        
        PriorityQueue<City>pq = new PriorityQueue<>((a,b)->(a.time-b.time));
        
        pq.add(new City(0,0));//src, dis
        
        while(!pq.isEmpty()){
            City rc = pq.poll();
            
            if(rc.time>dis[rc.city])continue;
            
            for(City ac:adj.get(rc.city)){
                if(dis[rc.city]+ac.time<dis[ac.city]){
                    
                    dis[ac.city] = dis[rc.city]+ac.time;
                    ways[ac.city] = ways[rc.city];
                    pq.add(new City(ac.city,dis[ac.city]));
                    
                }else if(dis[rc.city]+ac.time==dis[ac.city]){
                    ways[ac.city] = (ways[ac.city]+ways[rc.city])%m;
                }
            }
            
        }
        
        return ways[n-1];
    }
    class City{
        int city;
        int time;
        public City(int u,int time){
            this.city = u;
            this.time=time;
        }
    }
}