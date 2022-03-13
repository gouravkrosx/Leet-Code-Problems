class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        
         Set<String>set=new HashSet<>();
        for(int i=0;i<wordDict.size();i++){
            set.add(wordDict.get(i));
        }
        
        List<String>ans = new ArrayList<>();
                
         WordBreak(s,set,0,"",ans);
        return ans;
    }
    public void WordBreak(String str,Set<String>set,int start,String res,List<String>ans){
        if(start>=str.length()){
            ans.add(res.substring(0,res.length()-1));
            return;
        }
        
        for(int end=start+1;end<=str.length();end++){
            String s = str.substring(start,end);
            if(set.contains(s)){
                WordBreak(str,set,end,res+s+" ",ans);
            }
        }
    }
}