class Solution {
    public boolean detectCapitalUse(String word) {
        
        if(word.length()==0 || word.length()==1)return true;
        
        int size = word.length();
        
        
        char ch = word.charAt(0);
        
        if(Character.isLowerCase(ch)){
            for(int i=1;i<size;i++){
                char c = word.charAt(i);
                if(Character.isUpperCase(c))return false;
            }
        }else{
             boolean allcaps = (Character.isUpperCase(word.charAt(1)))?true:false;
            
                for(int i=1;i<size;i++){
                  char c = word.charAt(i);
                    if(allcaps){
                        if(Character.isLowerCase(c))return false;
                    }else{
                        if(Character.isUpperCase(c))return false;
                    } 
              }
        }
        
        return true; 
    }
}