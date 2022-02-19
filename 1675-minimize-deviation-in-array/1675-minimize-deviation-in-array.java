class Solution {
    public int minimumDeviation(int[] nums) {
      PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
     
        int min = Integer.MAX_VALUE;
        for(int i:nums){
            if(i%2!=0)i=i*2;
            min = Math.min(i,min);
            pq.add(i);
        }
        
        int diff = Integer.MAX_VALUE;
        while(pq.peek()%2==0){
            int max = pq.poll();
            diff = Math.min(diff,max-min);
            min = Math.min(min,max/2);
            pq.add(max/2);
        }
        return Math.min(diff,pq.peek()-min);
    }
}