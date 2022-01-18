class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {        
      
       int size = flowerbed.length;
        int count=0;
        
       for(int i=0;i<size && count<n;i++){
                        
           if(flowerbed[i]==1)continue;
           
           int next = (i+1==size)?0:flowerbed[i+1];
           int prev = (i==0)?0:flowerbed[i-1];
           
           if(next==0 && prev==0){
               flowerbed[i]=1;
               count++;
           }
        }
        
        return count==n;
    }
}