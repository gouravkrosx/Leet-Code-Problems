class Solution {
    // M1) Use Stack
    // M2) Below O(N) S(1)
    public boolean backspaceCompare(String s, String t) {
            
        int i=s.length()-1,j=t.length()-1;
        int countS = 0;
        int countT = 0;
        
        while(i>=0||j>=0){
            while(i>=0 && (countS>0 || s.charAt(i)=='#')){
                if(s.charAt(i)=='#')countS++;
                else countS--;
                i--;
            }
            
            char left = (i<0)?'@':s.charAt(i);
            
             while(j>=0 && (countT>0 || t.charAt(j)=='#')){
                if(t.charAt(j)=='#')countT++;
                else countT--;
                j--;
            }
            char right = (j<0)?'@':t.charAt(j);
            if(left!=right)return false;
            
            i--;
            j--;
        }
        return true;
    }
}