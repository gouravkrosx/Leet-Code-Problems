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
    
    long max=0;
    public int maxProduct(TreeNode root) {
        long tsum = TotalSum(root);
        maxProductOfSubtreeSum(root,tsum);
        return (int)(max%1000000007);
    }
    
    public long maxProductOfSubtreeSum(TreeNode node,long tsum){
        if(node==null)return 0;
        
        long left = maxProductOfSubtreeSum(node.left,tsum);
        long right = maxProductOfSubtreeSum(node.right,tsum);
        
        long sbsum = left+right+node.val;
        
        max = Math.max(max,(tsum-sbsum)*sbsum);        
        return sbsum;
    }
    
    public long TotalSum(TreeNode node){
        if(node==null)return 0;
        
        long left = TotalSum(node.left);
        long right = TotalSum(node.right);
        
        return node.val+left+right;
    }
    
}