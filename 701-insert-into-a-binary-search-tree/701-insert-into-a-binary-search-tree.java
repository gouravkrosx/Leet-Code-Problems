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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode node=root;
        TreeNode parent=node;
        while(node!=null){
                      
            if(node.val>val){
                node=node.left;
            }else if(node.val<val){
                node=node.right;
            }
            if(node==null){
                if(parent.val<val){
                    parent.right=new TreeNode(val);
                }else{
                    parent.left=new TreeNode(val);
                }
                break;
            }
            parent=node;
        }
        return root;
    }
}