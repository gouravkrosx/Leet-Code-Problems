class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>ans = new ArrayList<>();
        
        generateParenthesis(ans,"",0,0,n);
        return ans;
    }
    public void generateParenthesis(List<String>ans,String str,int open,int close,int n){
        
        if(open>n)return;
        
        if(open==close){
            if(open==n){
                ans.add(str);
                return;    
            }
        }
        
        if(close>open)return;
        
        generateParenthesis(ans,str+"(",open+1,close,n);
        generateParenthesis(ans,str+")",open,close+1,n);
    }
}