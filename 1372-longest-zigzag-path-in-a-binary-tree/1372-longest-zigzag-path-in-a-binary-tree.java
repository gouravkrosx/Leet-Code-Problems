/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right; 
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public int longestZigZag(TreeNode root) {
        return Math.max(goZigZag(root.left,true,0),goZigZag(root.right,false,0));      
    }
    
    public int goZigZag(TreeNode node,boolean dir, int len){
        if(node==null)return len;
        
        int followZZ = 0;
        int selfStart = 0;
        
        if(dir){ //if prev direction was left
            followZZ = goZigZag(node.right,false,len+1); //continue follow zigzag path
            selfStart = goZigZag(node.left,true,0);  // start your own path.
        }else{  // if prev direction was right
            followZZ = goZigZag(node.left,true,len+1); //continue follow zigzag path
            selfStart = goZigZag(node.right,false,0);  // start your own path.
            
        }
        return Math.max(followZZ,selfStart);
    }
    
    
}