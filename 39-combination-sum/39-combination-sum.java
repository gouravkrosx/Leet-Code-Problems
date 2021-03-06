class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    
    public void findCombinations(int idx,int[]arr,int tar,List<List<Integer>>ans,List<Integer> list){
        if(idx==arr.length){
            if(tar==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        
        
        if(tar>=arr[idx]){
            list.add(arr[idx]);
            findCombinations(idx,arr,tar-arr[idx],ans,list);
            list.remove(list.size()-1);
        }
        
        findCombinations(idx+1,arr,tar,ans,list);
    }
}