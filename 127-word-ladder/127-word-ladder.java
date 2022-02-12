class Solution {
    public int ladderLength(String src, String tar, List<String> wordlist) {
        
        if(!wordlist.contains(tar))return 0;
    
        HashMap<String,Boolean>vis=new HashMap<>();
        
        for(int i=0;i<wordlist.size();i++){
            vis.put(wordlist.get(i),false);
        }
        
        Queue<String>q=new LinkedList<>();
               
        vis.put(src,true);
        q.offer(src);
        int ans=1;
        
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String w=q.poll();
                
                if(w.equals(tar))return ans;
                
                wordMatch(w,vis,q);             
            }
            ans++;         
        }
        return 0;
    }
    public void wordMatch(String word,HashMap<String,Boolean>vis,Queue<String>q){
        
        char[] arr=word.toCharArray();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            for(int j=0;j<=26;j++){
                
                char temp=(char)('a'+j);
                arr[i]=temp;
                
                String str=new String(arr);
                if(vis.containsKey(str) && vis.get(str)==false){
                    vis.put(str,true);
                    q.offer(str);
                }
            }
            arr[i]=ch;
        }        
    }
}