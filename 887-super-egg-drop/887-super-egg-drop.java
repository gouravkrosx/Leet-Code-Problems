class Solution {
    public int superEggDrop(int k, int n) {
        int[][]dp=new int[k+1][n+1];
        
        for(int[]arr:dp){
            Arrays.fill(arr,-1);
        }
        
        return eggdrop(k,n,dp);
    }
    public int eggdrop(int eggs,int floors,int[][]dp){
        if(eggs==1||floors==1){
            return floors;
        }
        
        if(floors<=0){
            return 0;
        }
        if(dp[eggs][floors]>0)return dp[eggs][floors];
        
        int min=100000;
        int l=1;
        int h=floors;
        
        while(l<=h){
            int mid = (l+h)/2;
            int left = eggdrop(eggs-1,mid-1,dp);
            int right = eggdrop(eggs,floors-mid,dp);
            int temp = 1 + Math.max(left,right);
            if(left<right){  // since right is more than left and we need more in worst case 
                l = mid+1;   // so l=mid+1 to gain more temp for worst case : upward
            }else{
                h = mid-1;
            }
            min = Math.min(min,temp);
        }
        return dp[eggs][floors]=min;
    }
}