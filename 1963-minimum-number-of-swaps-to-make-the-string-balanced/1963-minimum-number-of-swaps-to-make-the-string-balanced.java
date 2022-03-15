class Solution {
/*
Intuition:

We can discard the balanced components from our input string as they will not matter in balancing the string. Now, after excluding them, we will find that all the unbalanced brackets look like this:

]]]]]…..[[[[[…..

Now, since we can swap any pair of brackets, the optimal approach is to balance 2 sets of brackets at a time using 1 swap (hinting at result = total unbalanced / 2, which we will handle for even and odd lengths together). Take this   

*/
    public int minSwaps(String s) {
        
        int open=0;
        
        for(char ch:s.toCharArray()){
            if(open>0 && ch==']'){
                open--;
            }else{
                open++;
            }
        }
        return (open+1)/2;
  }
}