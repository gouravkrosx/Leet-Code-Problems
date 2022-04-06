class Solution {
    public int threeSumMulti(int[] arr, int target) {
        long[] count = new long[101];
        
        //to count the occurences of numbers.
        for(int i=0;i<arr.length;i++)count[arr[i]]++;
            
        long res = 0; 
        long mod = 1000000007;
        
        for(int i=0;i<101;i++){
            for(int j=i;j<101;j++){
                int k = target - i - j;
                
                if(k>100 || k<0)continue;
                
                //nC3
                if(i==j && j==k){
                    res+=(count[i]*(count[i]-1)*(count[i]-2))/6;
                }
                
                //nC2
                else if(i==j && j!=k){
                    res+=((count[i]*(count[i]-1)/2)*(count[k]));
                }
                
                else if(i<j && j<k){
                    res+=(count[i]*count[j]*count[k]);
                }
                res=res%mod;
            }
        }
        return (int)res;
    }
}