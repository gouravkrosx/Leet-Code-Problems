class Solution {
   public static int myAtoi(String str) {
	
       
       str = str.trim();
       
       if(str.length()==0 || str==null)return 0;
       
       int len=str.length(),start=0,sign=1;
       
       if(str.charAt(start)=='-'){
           sign = -1;
           start++;
       }else if(str.charAt(start)=='+'){
           sign = +1;
           start++;
       }
       long sum=0;
       
       for(int i=start;i<len;i++){
           if(!Character.isDigit(str.charAt(i))){
               return (int)sum*sign;
           }
           sum = sum*10 + str.charAt(i)-'0';
           if(sign==1 && sum>Integer.MAX_VALUE){
               return Integer.MAX_VALUE;
           }
           if(sign==-1 && (sum*sign)<Integer.MIN_VALUE){
               return Integer.MIN_VALUE;
           }
       }
       return (int)(sum*sign);
   }
}