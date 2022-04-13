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
    public String getDirections(TreeNode root, int startValue, int destValue) {
        TreeNode ancestor = lowestCommonAncestor(root, startValue, destValue);
        List<String> toStart = new ArrayList<>();
        getDirection(ancestor, startValue, toStart);
        List<String> toDest = new ArrayList<>();
        getDirection(ancestor, destValue, toDest);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < toStart.size(); i++) sb.append("U");
        for (String s : toDest) sb.append(s);
        return sb.toString();
    }
    
    private TreeNode lowestCommonAncestor(TreeNode root, int p, int q) {
        if (root == null || p == root.val || q == root.val) return root; 
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) return root; 
        else return left == null ? right : left;
    }
    
    private boolean getDirection(TreeNode ancestor, int value, List<String> steps) {
        if (ancestor == null) return false;
        if (ancestor.val == value) return true;
        steps.add("L");
        if (getDirection(ancestor.left, value, steps)) return true;
        steps.remove(steps.size() - 1);
        steps.add("R");
        if (getDirection(ancestor.right, value, steps)) return true;
        steps.remove(steps.size() - 1);
        return false;
    }
}