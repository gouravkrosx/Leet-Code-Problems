class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
       
        List<Integer>[]Bucket = new ArrayList[nums.length+1];
        
        for(int key:map.keySet()){
            int freq = map.get(key);
            if(Bucket[freq]==null){
                Bucket[freq] = new ArrayList<>();
            }
            Bucket[freq].add(key);
        }
        
        int[] res = new int[k];
        int j=0;
        for(int pos=nums.length;pos>=0;pos--){
            if(Bucket[pos]!=null){
                int i=0;
                while(i<Bucket[pos].size() && j<k){
                    res[j] = Bucket[pos].get(i);
                    j++;
                    i++;
                }
            }
        }
        return res;
    }
}