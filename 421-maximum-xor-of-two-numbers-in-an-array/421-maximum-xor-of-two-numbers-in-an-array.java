class Solution {
    
    //Explanation video -> https://www.youtube.com/watch?v=xheOEvLI5ps
    
    public int findMaximumXOR(int[] nums) {
        
        int max=0,mask=0;
        
        for(int i=31;i>=0;i--){
            
            mask = mask | (1<<i);
            
            Set<Integer>set = new HashSet<>();
            for(int num:nums){
                set.add(num & mask);
            }
            
            int greedyTry = max | (1<<i);

            for(int leftNum: set){
                int anotherNum = greedyTry ^ leftNum;
                
                if(set.contains(anotherNum)){
                    max = greedyTry;
                    break;
                }
            }    
        }
        
        return max;
    }
}