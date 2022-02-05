class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        

        TreeSet<Long>set = new TreeSet<>();
        
        for(int i=0;i<nums.length;i++){
            long val = nums[i];
            
            Long floor = set.floor(val);
            Long ceil = set.ceiling(val);
            
            if((floor!=null && val-floor<=t) || (ceil!=null && ceil-val<=t)){
                return true;
            }
            
            set.add(val);
            
            if(i>=k){
                set.remove((long)nums[i-k]);
            }
        }
        return false;
    }
}