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
    public int kthSmallest(TreeNode root, int k) {
        int[]K = new int[2];
        
        kthSmallest(root,K,k);
        return K[1];
    }
    public void kthSmallest(TreeNode node, int[]arr,int k){
        if(node==null)return;
        
        kthSmallest(node.left,arr,k);
        arr[0]++;
        if(arr[0]==k){
            arr[1]=node.val;
            return;
        }
        kthSmallest(node.right,arr,k);
    }
}