class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
       
        combinationSum3(k,0,n,new ArrayList<>(),ans);
        return ans;
    }
    public void combinationSum3(int k,int lastNum,int tar,List<Integer>list, List<List<Integer>>ans){
        
        if(k==0){
            if(tar==0){
                ans.add(new ArrayList<>(list));
            }
        }
        
        //try all the numbers from 1-9 
        for(int num=lastNum+1;num<=9;num++){
            if(tar>=num){
                list.add(num);
                combinationSum3(k-1,num,tar-num,list,ans);
                list.remove(list.size()-1);
            }
        }
    }
}