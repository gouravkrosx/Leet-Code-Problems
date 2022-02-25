class Solution {
    public int compareVersion(String v1, String v2) {
        
        boolean f1=false;
        boolean f2=false;
        int m = v1.length();
        int n = v2.length();
        int i=0,j=0;
        
        while(i<m || j<n){
            f1=false;
            f2=false;
            
            String s1="";
            while(i<m && v1.charAt(i)!='.'){
                s1+=v1.charAt(i++);
                f1=true;                              
            }
            i++; //to skip the dot
            
            String s2="";
            while(j<n && v2.charAt(j)!='.'){
                s2+=v2.charAt(j++);
                f2=true;   
            }
            j++;
            
            int a=0,b=0;
            if(f1){
                a=Integer.parseInt(s1);
            }
            
            if(f2){
                b=Integer.parseInt(s2);   
            }
            
            if(a>b){
                return 1;
            }else if(a<b){
                return -1;
            }
            
        }
        return 0;
    }
}