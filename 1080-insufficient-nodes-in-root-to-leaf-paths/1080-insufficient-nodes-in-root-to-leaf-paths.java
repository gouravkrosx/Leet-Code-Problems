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
    public TreeNode sufficientSubset(TreeNode root, int limit) {
        return heavyPath(root,0,limit);
    }
    public TreeNode heavyPath(TreeNode node,int ssf,int limit){
        if(node==null)return null;
        
        if(node.left==null && node.right==null){
            if(ssf+node.val<limit){
                return null;
            }
            return node;
        }
        
        node.left = heavyPath(node.left,ssf+node.val,limit);
        node.right = heavyPath(node.right,ssf+node.val,limit);
        
        if(node.left==null && node.right==null)return null;

        return node;
    }
}