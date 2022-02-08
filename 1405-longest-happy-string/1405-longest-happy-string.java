class Solution {
    public String longestDiverseString(int a, int b, int c) {
        PriorityQueue<pair> pq = new PriorityQueue<>((x,y)->(y.count - x.count));
        
        if(a>0)pq.add(new pair('a',a));
        if(b>0)pq.add(new pair('b',b));
        if(c>0)pq.add(new pair('c',c));

        StringBuilder ans = new StringBuilder();
        while(pq.size()>1){
            pair first = pq.poll();
            
            if(first.count>=2){
                ans.append(first.ch);
                ans.append(first.ch);
                first.count-=2;    
            }else{
                ans.append(first.ch);
                first.count-=1;
            }
                        
            pair second = pq.poll();
            
            if(second.count>=2 && first.count<second.count){
                ans.append(second.ch);
                ans.append(second.ch);
                second.count-=2;
            }else{
                ans.append(second.ch);
                second.count-=1;
            }
            
            if(first.count>0) pq.add(first);
            
            if(second.count>0) pq.add(second);

        }
        
        if(!pq.isEmpty()){
            pair rp = pq.poll();
            if(rp.count>=2){
                ans.append(rp.ch);
                ans.append(rp.ch);
                rp.count-=2;
            }else{
                ans.append(rp.ch);
                rp.count-=1;
            }
        }
        
        return ans.toString();
    }
    public class pair{
        char ch;
        int count;
        public pair(char c,int count){
            this.ch = c;
            this.count = count;
        }
    }
}