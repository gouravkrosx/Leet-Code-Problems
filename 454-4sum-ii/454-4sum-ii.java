class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer,Integer>map = new HashMap<>();
        
        
        for(int a3:nums3){
            for(int a4:nums4){
                map.put(a3+a4,map.getOrDefault(a3+a4,0)+1);
            }
        }
        
        int ans = 0;
        
        for(int a1:nums1){
            for(int a2:nums2){
                int tar = a1+a2;
                ans+= map.getOrDefault(-(a1+a2),0);                
            }
        }
        return ans;
    }
}