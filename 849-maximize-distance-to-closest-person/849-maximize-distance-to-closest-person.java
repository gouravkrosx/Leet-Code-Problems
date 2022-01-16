class Solution {
    public int maxDistToClosest(int[] seats) {
        
        int n = seats.length;
        
        int lastindex = -1;
        int ans=1;
        
        for(int i=0;i<n;i++){
            if(seats[i]==1){
                if(lastindex==-1){
                    ans=Math.max(ans,i);
                }else{
                    ans = Math.max(ans,(i-lastindex)/2);
                }
                lastindex=i;
            }
        }
        
        ans=Math.max(ans,n-lastindex-1);
        return ans;
    }
}