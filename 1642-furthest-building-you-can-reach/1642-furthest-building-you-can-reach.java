class Solution {
    /*
    
    The optimal way of going forward requires us to use ladders for gaps that are larger than others and use bricks for the rest.
So we just need to maintain a min heap during the scan and keep its size smaller than number of ladders. Once the size of heap is larger than the number of ladders, that means we need to use bricks for the smallest gap in the heap.
    
    */
    
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        
        for(int i=1;i<heights.length;i++){
            int diff = heights[i]-heights[i-1];
            
            if(diff<=0)continue;  //next height is smaller so just jump
            
            pq.add(diff);
            
            if(pq.size()>ladders){ //means all ladders have been used in heights now for the lowest heights diff using bricks
                bricks-=pq.poll();
            }
            
            if(bricks<0)return i-1;
        }
        
        return heights.length-1;
    }
}