class Solution {
    public int integerBreak(int n) {
        if(n==2)return 1;
        if(n==3)return 2;
        
        if(n%3==0){
            int p = n/3;
            return (int)Math.pow(3,p);
        }
        long pro=1l;
        while(n!=0){
            if(n==4){
                return (int)(pro*4);
            }
            if(n>=3){
                pro*=3;
                n-=3; 
            }else{
                pro*=2;
                n-=2;
            } 
        }
        return (int)(pro);
    }
}