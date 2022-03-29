class Solution {
    int[]bob = new int[12];
    int maxS = Integer.MIN_VALUE;
    
    public int[] maximumBobPoints(int numArrows, int[] aliceArrows) {
        
        int[]res = new int[12];
        
        findMaxScore(numArrows,11,aliceArrows,res,0);
        return bob;
    }
    public void findMaxScore(int nar,int idx,int[]arr,int[]res,int msc){
        if(idx<0 || nar<=0){
            if(nar>0){
                res[0]+=nar;
            }
            if(msc>maxS){
                maxS = msc;
                bob=res.clone();
            }
            return;
        }
        
        int req = arr[idx]+1;
        if(req<=nar){
            res[idx]=req;
            findMaxScore(nar-req,idx-1,arr,res,msc+idx);
            res[idx]=0;
        }
        findMaxScore(nar,idx-1,arr,res,msc);
        res[idx]=0;
    }
}