class Solution {
    public int addDigits(int n) {
        
        int sum=0;
        while(n/10!=0){
            int temp = n;
            sum=0;
            while(temp!=0){
                int rem = temp%10;
                sum+=rem;
                temp/=10;
            }
            n=sum;
        }
        return n;
    }
}