class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>>ans=new ArrayList<>();
        
        Arrays.sort(candidates);
        
        findCombinations(0,candidates,target,ans,new ArrayList<>());
        return ans;
    }
    
    public void findCombinations(int idx,int[]arr,int tar,List<List<Integer>>ans,List<Integer> list){
        
            if(tar==0){
                 ans.add(new ArrayList<>(list));                  
                 return;
            }
    
        
        for(int i=idx;i<arr.length;i++){
            if(i>idx && arr[i]==arr[i-1]){
                continue;
            }
            if(arr[i]>tar)break;  //since arrays is sorted so no further elements can be taken
         
            if(tar>=arr[i]){
                list.add(arr[i]);
                findCombinations(i+1,arr,tar-arr[i],ans,list);
                list.remove(list.size()-1);
         }                 
      }
        
    }
}