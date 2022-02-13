class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
       List<Integer>list=new ArrayList<>();
        
        Arrays.sort(nums);
    
        powerSet(nums,0,list,ans);
        return ans;
    }
    public void powerSet(int[]nums,int i,List<Integer>list,List<List<Integer>>ans){
        if(i==nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        
        //yes
        list.add(nums[i]);
        powerSet(nums,i+1,list,ans);
        list.remove(list.size()-1);
        //no
        powerSet(nums,i+1,list,ans);
    }
}