class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int size=piles.length;
        
        int lo = 1;
        int hi = Integer.MIN_VALUE;
        
        for(int i=0;i<size;i++){
            hi=Math.max(hi,piles[i]);
        }
        
        int ans = 1;
        
        while(lo<=hi){
            int mid = (lo+hi)/2;
            
            if(isValidSpeed(piles,mid,h)){
                ans=mid;
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
        return ans;        
    }
    public boolean isValidSpeed(int[]piles,int mid,int hours){
        int time=0;
        for(int i=0;i<piles.length;i++){
            if(time>hours)return false;
            
            time+= Math.ceil((double)piles[i]/(double)mid);
        }
        return time<=hours;
    }
}