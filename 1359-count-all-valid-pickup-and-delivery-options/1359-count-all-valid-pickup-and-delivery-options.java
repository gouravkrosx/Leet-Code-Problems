class Solution {
    public int countOrders(int n) {
        long ans=1;
        long mod = (long)(1e9+7);
        
        for(int i=2;i<=n;i++){
            long spaces = (i-1)*2+1; // (__ P1 __ D1 __)
            ans*=spaces*(spaces+1)/2;
            ans%=mod;
        }    
        
        return (int)ans;
    }
}