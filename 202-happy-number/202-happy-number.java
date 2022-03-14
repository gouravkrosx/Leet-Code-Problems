class Solution {
    public boolean isHappy(int n) {
     // since the problem contains cycle word so we can think of floyd's cycle finding algo
        
        int s = n;
        int f = n;
        
        do{
           s = compute(s);
           f = compute(compute(f));
            
        }while(s!=f);
         
        return s==1;    
    }
    public int compute(int n){
        int s=0;
        while(n!=0){
            s+= (n%10)*(n%10);
            n/=10;
        }
        return s;
    }
}