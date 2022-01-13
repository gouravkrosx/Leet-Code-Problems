class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>>ans=new ArrayList<>();
        Combinations(1,n,k,new ArrayList<>(),ans);
        return ans;
    }
    public void Combinations(int i,int n,int k,List<Integer>list,List<List<Integer>>ans){
        if(i==n+1){
            if(k==0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        
            
        //include 
        list.add(i);
        Combinations(i+1,n,k-1,list,ans);
        list.remove(list.size()-1);
        
        Combinations(i+1,n,k,list,ans);
    }
}