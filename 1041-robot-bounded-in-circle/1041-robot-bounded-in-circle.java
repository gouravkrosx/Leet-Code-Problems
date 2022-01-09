class Solution {
    public boolean isRobotBounded(String instructions) {
        // for understanding this problem -> https://leetcode.com/problems/robot-bounded-in-circle/discuss/850969/My-Java-Solution-with-the-thought-process
        
        int x=0,y=0;
        String dir="North";
        
        for(char ch:instructions.toCharArray()){
            
            if(ch=='G'){
                
                if(dir.equals("North")){
                    y++;
                }else if(dir.equals("South")){
                    y--;
                }else if(dir.equals("East")){
                    x++;
                }else{
                    x--;
                }
                
            }else if(ch=='L'){
                
                if(dir.equals("North")){
                    dir="West";
                }else if(dir.equals("South")){
                    dir="East";
                }else if(dir.equals("East")){
                    dir="North";
                }else{
                    dir="South";
                }
                
            }else{
               
                if(dir.equals("North")){
                    dir="East";
                }else if(dir.equals("South")){
                    dir="West";
                }else if(dir.equals("East")){
                    dir="South";
                }else{
                    dir="North";
                }
            }
        }
        
        //if it get back to the original position
        if(x==0 && y==0){
            return true;
        }
        
        if(dir.equals("North")){
            return false;
        }
        
        return true;
    }
}