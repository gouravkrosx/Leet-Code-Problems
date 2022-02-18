class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<HashMap<Character,Integer>,List<String>>bmap = new HashMap<>();
        
        for(int i=0;i<strs.length;i++){
            char[] crr = strs[i].toCharArray();
           
            HashMap<Character,Integer>fmap = new HashMap<>();
            for(int j=0;j<crr.length;j++){
                fmap.put(crr[j],fmap.getOrDefault(crr[j],0)+1);
            }
            
            if(!bmap.containsKey(fmap)){
                List<String>list = new ArrayList<>();
                list.add(strs[i]);
                bmap.put(fmap,list);
            }else{
                List<String> list = bmap.get(fmap);
                list.add(strs[i]);
            }
        }
        List<List<String>>ans = new ArrayList<>();
        for(List<String>l : bmap.values()){
            ans.add(l);
        }
        return ans;
    }
}