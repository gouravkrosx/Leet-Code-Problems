class Solution {
    public void duplicateZeros(int[] arr) {
        int zeros = 0;
        for(int val:arr){
            if(val==0)zeros++;
        }
        
        int n=arr.length;
        int len = n+zeros;
        
        for(int i=n-1;i>=0;i--){
            int num = arr[i];
            if(num==0){
                if(len-1<n){
                    len--;
                    arr[len]=0;
                }else{
                    len--;
                }
                
                if(len-1<n){
                    len--;
                    arr[len]=0;
                }else{
                    len--;
                }
            }else{
                if(len-1<n){
                    len--;
                    arr[len]=arr[i];
                }else{
                    len--;
                }
            }
        }
        
    }
}