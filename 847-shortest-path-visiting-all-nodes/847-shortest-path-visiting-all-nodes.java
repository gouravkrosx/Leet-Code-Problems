class Solution {
    public int shortestPathLength(int[][] graph) {
        int n = graph.length;
        int mask = (1<<n)-1;
        
        Queue<int[]>q = new LinkedList<>();
        Set<String>visPath = new HashSet<>();
        
        for(int i=0;i<n;i++){
            q.offer(new int[]{i,1<<i});
            visPath.add(i+":"+(1<<i));
        }
        
        int count = 0;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int[]rnode = q.poll();
                if(rnode[1]==mask)return count;
                
                for(int node:graph[rnode[0]]){
                    int next = rnode[1] | (1<<node);
                    if(visPath.contains(node+":"+next))continue;
                    visPath.add(node+":"+next);
                    q.offer(new int[]{node,next});
                }
            }
            count++;
        }
        return count;
    }
}