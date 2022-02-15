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
 int maxStep = 0;
    public int longestZigZag(TreeNode root) {
        dfs(root, true, 0);
        // dfs(root, false, 0);
        return maxStep;
    }
    private void dfs(TreeNode root, boolean isLeft, int step) {
        if (root == null) return;
        maxStep = Math.max(maxStep, step); // update max step sofar
        if (isLeft) {
            dfs(root.left, false, step + 1); // keep going from root to left
            dfs(root.right, true, 1); // restart going from root to right
        } else {
            dfs(root.right, true, step + 1); // keep going from root to right
            dfs(root.left, false, 1); // restart going from root to left
        }
    }
}