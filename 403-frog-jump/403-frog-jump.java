class Solution {
    public boolean canCross(int[] stones) {
        
        int n = stones.length;
        
        HashMap<Integer,HashSet<Integer>>map = new HashMap<>();
        
        
        for(int i=0;i<n;i++){
            map.put(stones[i],new HashSet<>());
        }
        //since from 0 we can take 1 jump only
        map.get(stones[0]).add(1);
        
        for(int i=0;i<n;i++){
            int currStone = stones[i];
            
            HashSet<Integer> jumps = map.get(currStone);
            
            for(int jump: jumps){
                int pos = currStone + jump;
                
                if(pos == stones[n-1])return true;
                
                if(map.containsKey(pos)){
                    if(jump-1>0)map.get(pos).add(jump-1);
                    map.get(pos).add(jump);
                    map.get(pos).add(jump+1);
                }
                
            }          
        }
        return false;
    }
}