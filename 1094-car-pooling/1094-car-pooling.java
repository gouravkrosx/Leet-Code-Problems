class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        
        int[]prefix=new int[1001];
        
        for(int i=0;i<trips.length;i++){
            int numP=trips[i][0];
            int from=trips[i][1];
            int to=trips[i][2];
            prefix[from]+=numP;
            prefix[to]+=-numP;
        }
        
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i]+prefix[i-1];
//         }
        
//         for(int i=0;i<prefix.length;i++){
//             if(prefix[i]>capacity){
//                 return false;
//             }
//         }
        
          for (int i = 0; capacity >= 0 && i < 1001; ++i) capacity -= prefix[i];
        
        return capacity>=0;
    }
}