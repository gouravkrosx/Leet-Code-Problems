class Solution {
    public String addBinary(String a, String b) {
     
        StringBuilder sb = new StringBuilder();
        
        char[]arr=a.toCharArray();
        char[]brr=b.toCharArray();
        
        int carry=0;
        
        int i=arr.length-1;
        int j=brr.length-1;
        while(i>=0 && j>=0){
        
            int sum = arr[i]-'0' + brr[j]-'0' + carry;
            
            sb.append(sum%2);
            carry=sum/2;
            i--;
            j--;
            
        }
        
        while(j>=0){
           int sum=brr[j]-'0'+carry;
            sb.append(sum%2);
            carry=sum/2;
            j--;
        }
        while(i>=0){
           int sum=arr[i]-'0'+carry;
            sb.append(sum%2);
            carry=sum/2;
            i--;
        }
        
        if(carry!=0){
            sb.append(carry);
        }
        
        
        return sb.reverse().toString();
    }
}