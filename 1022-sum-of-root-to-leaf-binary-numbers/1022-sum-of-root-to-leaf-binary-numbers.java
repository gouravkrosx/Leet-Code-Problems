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
    public int sumRootToLeaf(TreeNode root) {
        if(root==null){
            return 0;
        }
        
       return sumRootToLeaf(root,0);
      
    }
    public int sumRootToLeaf(TreeNode node, int parentSum){
        if(node==null){
            return 0;
        }
        
        parentSum=parentSum*2+node.val;
        
        if(node.left==null && node.right==null){
         
            return parentSum;
        }
        
        return sumRootToLeaf(node.left,parentSum)+sumRootToLeaf(node.right,parentSum);
    }
}