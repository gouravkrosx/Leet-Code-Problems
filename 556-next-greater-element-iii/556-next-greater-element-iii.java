class Solution {
    public int nextGreaterElement(int n) {
        char[]crr = (n+"").toCharArray();
        
        int len = crr.length;
        
        int idx1 = -1;
        for(int i=len-1;i>0;i--){
            if(crr[i]>crr[i-1]){
                idx1 = i;
                break;
            }
        }
        if(idx1==-1)return -1;
        
        idx1--;
        
        int idx2=len-1;
        
        for(int i=len-1;i>=0;i--){
            if(crr[idx1]<crr[i]){
                idx2=i;
                break;
            }
        }
        
        char temp = crr[idx1];
        crr[idx1] = crr[idx2];
        crr[idx2] = temp;
        
        reverse(crr,idx1+1,len-1);
        
        long ans = Long.parseLong(new String(crr));
        
       return ((ans <= Integer.MAX_VALUE)?(int)ans:-1);
    }
    public void reverse(char[]crr,int i,int j){
        while(i<j){
            char temp = crr[i];
            crr[i] = crr[j];
            crr[j] = temp;
            i++;
            j--;
        }
    }
}