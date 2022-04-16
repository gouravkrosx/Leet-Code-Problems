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
    int prev=0;
    public TreeNode convertBST(TreeNode root) {
        dfs(root);
        return root;
    }
    
    private void dfs(TreeNode node){
        if(node==null) return;
        dfs(node.right);
        node.val+=prev;
        prev=node.val;
        dfs(node.left);
    }
}