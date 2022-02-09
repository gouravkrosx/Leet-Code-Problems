class Solution {
    public int findPairs(int[] nums, int k) {
        
        int ans=0;
        
        HashMap<Integer,Integer>map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        
        for(int key: map.keySet()){
            
            if(k==0)
            {
                if(map.get(key)>=2){
                    ans++;
                }
            }else if(map.containsKey(key+k)){
                ans++;
            }
        }

        return ans;
    }
}