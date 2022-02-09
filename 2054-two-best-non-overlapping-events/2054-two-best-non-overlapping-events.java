class Solution {
    public int maxTwoEvents(int[][] events) {
     int n = events.length;
        
     Arrays.sort(events, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);   
     PriorityQueue<int[]>pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
     
     int max = 0;
     int res = 0;
     for(int i=0; i<n; i++){
         int start = events[i][0];
       
         while(!pq.isEmpty() && pq.peek()[1] < start){
             int[]arr = pq.poll();
             max = Math.max(max,arr[2]);
         }
         res = Math.max(res,events[i][2]+max);
         pq.add(events[i]);
     }                                             
        return res;
    }
}