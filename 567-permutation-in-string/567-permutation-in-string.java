class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length()>s2.length()) return false;
        
        HashMap<Character,Integer>map = new HashMap<>();
        
        int psize = s1.length();
        int size = s2.length();
        
        for(int i=0;i<psize;i++){
            char ch = s1.charAt(i); 
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        int begin = 0, end = 0;
        
        int counter = map.size(); //taking map size because string can also have duplicates.
        
        while(end<size){
            char c = s2.charAt(end);
            if(map.containsKey(c)){
                map.put(c,map.get(c)-1);
                if(map.get(c)==0)counter--;
            }
            
            end++;
            
            while(counter==0){
                char temp = s2.charAt(begin);
                if(map.containsKey(temp)){
                    map.put(temp,map.get(temp)+1);
                    if(map.get(temp)>0)counter++;
                }
                
                if(end-begin == psize){
                    return true;
                }
                begin++;
            } 
        }
        
        return false;
        
    }
}