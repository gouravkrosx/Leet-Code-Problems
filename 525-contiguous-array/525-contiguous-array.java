class Solution {
    public int findMaxLength(int[] nums) {
        int n =nums.length;
        
      
        HashMap<Integer,Integer>map = new HashMap<>();
        
        int sum=0;
        
        int max=0;
        for(int i=0;i<n;i++){
            sum+=((nums[i]==0)?1:-1);;
            if(sum==0){
                max=i+1;
            }else{
                if(map.containsKey(sum)){
                    max = Math.max(max,i - map.get(sum));
                }else{
                    map.put(sum,i);    
                }
            }
        }
        return max;    
    }
}