class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3 || arr[0]>=arr[1])return false;
        
        
        boolean fl = false;
        int right=0;
        
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[i])return false;
            
            if(!fl){
                if(arr[i-1]<arr[i]){
                    
                }else{
                    fl=true;
                    right=1;
                }
            }else{
                if(arr[i-1]>arr[i]){
                    right=1;
                }else{
                    return false;
                }
            }
        }
        
        return (right==1);
    }
}