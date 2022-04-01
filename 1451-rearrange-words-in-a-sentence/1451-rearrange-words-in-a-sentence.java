class Solution {
    public String arrangeWords(String text) {
        
        String[] str = text.split(" ");
        
        Arrays.sort(str,new Comparator<>(){
           @Override
            public int compare(String a,String b){
                if(a.length()==b.length()){
                    return 0;
                }else{
                    return a.length()-b.length();
                }
            }
        });
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<str.length;i++){
            String s = str[i];
            char ch = s.charAt(0);
            String ros = s.substring(1);    
            if(i==0){
                sb.append(Character.toUpperCase(ch)+""+ros+" ");
            }else if(i<str.length-1){
                sb.append(Character.toLowerCase(ch)+""+ros+" ");
            }else{
                sb.append(Character.toLowerCase(ch)+""+ros);
            }
            
        }
        
      
        return sb.toString();
    }
}