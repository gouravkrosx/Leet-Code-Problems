class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[]cnt = new int[1001];
        
        for(int n:arr1){
            cnt[n]++;
        }
        
        int j=0;
        for(int n:arr2){
            while(cnt[n]-->0){
                arr1[j++]=n;
            }
        }
        
        for(int i=0;i<cnt.length;i++){
            while(cnt[i]-->0){
                arr1[j++]=i;
            }
        }
        return arr1;
    }
}