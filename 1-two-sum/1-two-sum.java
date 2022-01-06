class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int[]res=new int[2];
        
        ArrayList<pair>list=new ArrayList<>();
        
        for(int i=0;i<nums.length;i++){
            list.add(new pair(nums[i],i));
        }
        
        Collections.sort(list,(a,b)->(a.val-b.val));
        
        int l=0;
        int r=nums.length-1;
        
        while(l<r){
            if(list.get(l).val+list.get(r).val==target){
                res[0]=list.get(l).idx;
                res[1]=list.get(r).idx;
                break;
            }else if(list.get(l).val+list.get(r).val<target){
                l++;
            }else{
                r--;
            }
        }
        return res;
    }
    class pair{
        int val;
        int idx;
        pair(int v,int i){
            val=v;
            idx=i;
        }
    }
}