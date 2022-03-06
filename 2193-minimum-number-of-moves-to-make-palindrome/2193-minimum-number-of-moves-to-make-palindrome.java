class Solution {
//https://leetcode.com/problems/minimum-number-of-moves-to-make-palindrome/discuss/1821950/Java-solution-using-Greedy
/*
1. The idea is to compare first and last character.
2. If characters are same then str = str.substring(1,len-1);
3. If not then greedily check which character needs min moves.
4. For first character check its last occurence and see how many moves required to move it to last.
5. For last character check its first occurence and see how many moves required to move it to last.
6. Take min of both and add to final ansCount;

*/
    public int minMovesToMakePalindrome(String s) {

       int count=0;
       
        while(s.length()>2){
            int ch1 = s.charAt(0);
            int len = s.length();
            int ch2 = s.charAt(len-1);
            
            if(ch1==ch2){
                s = s.substring(1,len-1);
            }else{
                int id1 = s.lastIndexOf(ch1);
                int id2 = s.indexOf(ch2);
                
                int steps1 = len - id1 - 1;
                int steps2 = id2;
                
                StringBuilder sb = new StringBuilder();
                if(steps1>=steps2){
                    count+=steps2;
                    //remove last character
                    sb.append(s.substring(0,id2));
                    sb.append(s.substring(id2+1,len-1));
                }else{
                    count+=steps1;
                    //remove first character
                    sb.append(s.substring(1,id1));
                    sb.append(s.substring(id1+1));
                }
                s = sb.toString();
            }
        }
        
       return count;
    }
}