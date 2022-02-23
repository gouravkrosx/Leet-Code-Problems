class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String>ans = new ArrayList<>();
        IpAddresses(s,"",0,ans);
        return ans;
    }
    public void IpAddresses(String str,String ip,int dots,List<String>ans){
        if(str.length()==0)return;
        
        if(dots==3){
        
            if(str.length()==1){
                ip+=str;
                ans.add(ip);
            }
            else if(str.length()<=3 && str.charAt(0)!='0' && Integer.parseInt(str)<=255){
                ip+=str;
                ans.add(ip);    
            }
            return;
        }
        
        for(int i=1;i<=3;i++){
            
            if(i>=str.length())break;
            
            String temp = str.substring(0,i);
           if(i==1){
               IpAddresses(str.substring(i),ip+temp+".",dots+1,ans);
           }else{
               if(str.charAt(0)=='0')break;
               
               if(Integer.parseInt(temp)<=255)
               IpAddresses(str.substring(i),ip+temp+".",dots+1,ans);
           }
        }
    }
}