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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums,0,nums.length-1);
    }
    public TreeNode construct(int[]nums,int lo,int hi){
        if(lo<0 || lo>hi || hi>=nums.length){
            return null;
        }
        
        int max = Integer.MIN_VALUE;
        int mi = 0;
        
        for(int i=lo;i<=hi;i++){
            if(max<nums[i]){
                max = nums[i];
                mi=i;
            }
        }
        
        TreeNode node = new TreeNode(max);
        
        node.left = construct(nums,lo,mi-1);
        node.right = construct(nums,mi+1,hi);
            
        return node;    
    }
    
}