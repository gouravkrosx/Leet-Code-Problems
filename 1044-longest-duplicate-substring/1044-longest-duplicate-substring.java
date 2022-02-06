class Solution {
    public String longestDupSubstring(String s) {
     // Sliding window, Binary Search and Rolling Hash Function (Rabin Karp) Solution.
     // Take prime number as d = 31, as we know that hash = pow(d,m-1) where m =number of character is that window.    
    
        int lo=1;
        int hi = s.length()-1;
        String ans = "";
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            
            String dup = getDuplicate(s,mid);
            if(dup!=null){
                lo=mid+1;
                ans=dup;
            }else{
                hi=mid-1;
            }
        }
        
        return ans;
    }
    
    public String getDuplicate(String str, int w_size){
        long H = hash(str.substring(0,w_size));
        
        long pow = 1;
        for(int i=1;i<w_size;i++){
            pow = pow*31;
        }
        
        Set<Long>set = new HashSet<>();
        set.add(H);
        
        // sliding window
        for(int i=w_size;i<str.length();i++){
             H = nextHash(pow,H,str.charAt(i-w_size),str.charAt(i));
            
            if(!set.add(H)){ //return true if not present earlier
                return str.substring(i-w_size+1,i+1);
            }
        }
        return null;
    }
    public long hash(String str){
        long h = 0;
        long a = 1;
        
        for(int i=str.length()-1;i>=0;i--){
            char ch = str.charAt(i);
            h+=(ch-'a'+1)*a;
            a*=31;
        }
        
        return h;
    }
    
    public long nextHash(long pow,long hash,char left, char right){
        return ((hash - (left-'a'+1) * pow) * 31 + (right - 'a' + 1));
    }
    
}