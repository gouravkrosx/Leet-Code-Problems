class Solution {
    public int maxTurbulenceSize(int[] arr) {
        if(arr.length==1)return 1;
        
        int case1=1;
        int c1=1;
        int case2=1;
        int c2=1;
        
        // for even greater case
        for(int i=0;i<arr.length-1;i++){
            if(i%2==0){
                if(arr[i]>arr[i+1]){
                    c1++;
                }else{
                    c1=1;
                }
            }else{
                if(arr[i]<arr[i+1]){
                    c1++;
                }else{
                    c1=1;
                }
            }
            case1=Math.max(case1,c1);
        }
        
        // for odd greater case
        for(int i=0;i<arr.length-1;i++){
            if(i%2!=0){
                if(arr[i]>arr[i+1]){
                    c2++;
                }else{
                    c2=1;
                }
            }else{
                if(arr[i]<arr[i+1]){
                    c2++;
                }else{
                    c2=1;
                }
            }
            case2=Math.max(case2,c2);
        }
        return Math.max(case1,case2);
    }
}