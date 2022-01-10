class Solution {
    public int maxProduct(String s) {
              
       return maxProductLengthPalindromicSubsequences(s.toCharArray(),"","",0,0);
    }
    
   public int maxProductLengthPalindromicSubsequences(char[]arr,String s1, String s2, int idx,int max){
       if(idx==arr.length){
           if(isPalindrome(s1) && isPalindrome(s2)){
               max=Math.max(max,s1.length()*s2.length());
           }
           return max;
       }
        
        int op1=maxProductLengthPalindromicSubsequences(arr,s1+arr[idx],s2,idx+1,max);
        int op2=maxProductLengthPalindromicSubsequences(arr,s1,s2+arr[idx],idx+1,max);
        int op3=maxProductLengthPalindromicSubsequences(arr,s1,s2,idx+1,max);
        
       return  Math.max(op1,Math.max(op2,op3));
   } 
    public boolean isPalindrome(String str){
        int lo=0;
        int hi=str.length()-1;
        
        while(lo<hi){
            
            if(str.charAt(lo)!=str.charAt(hi)){
                return false;
            }
            
            lo++;
            hi--;
        }
        return true;
    }
}