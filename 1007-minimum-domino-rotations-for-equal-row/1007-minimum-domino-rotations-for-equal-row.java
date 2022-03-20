class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        
        int min=Integer.MAX_VALUE;
        for(int dice=1;dice<=6;dice++){
            int c=0;
            int r=0;
            for(int i=0;i<tops.length;i++){
                if(tops[i]==dice){
                    c++;
                }else if(bottoms[i]==dice){
                    c++;
                    r++;
                }
            }    
            
            if(c==tops.length){
                min = Math.min(min,r);
            }
        }
        
        for(int dice=1;dice<=6;dice++){
            int c=0;
            int r=0;
            for(int i=0;i<bottoms.length;i++){
                if(bottoms[i]==dice){
                    c++;
                }else if(tops[i]==dice){
                    c++;
                    r++;
                }
            }    
            
            if(c==bottoms.length){
                min = Math.min(min,r);
            }
        }
        
        
        return (min==Integer.MAX_VALUE)?-1:min;
    }
}