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
    TreeNode head;
    TreeNode prev;
    public TreeNode increasingBST(TreeNode root) {
        if(root==null)return null;
        
        increasingOrder(root);
        return head;
    }
    public void increasingOrder(TreeNode node){
        if(node==null)return;
        
        increasingOrder(node.left);
        
        if(head==null){
            head=prev=node;
            
        }else{
            prev.right = node;
            node.left = null;                
            prev = node;               
        }
        increasingOrder(node.right);
    }
}