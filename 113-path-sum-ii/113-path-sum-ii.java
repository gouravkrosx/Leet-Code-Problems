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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        
         pathSum(root,targetSum,ans,new ArrayList<>());
        return ans;
    }
    public void pathSum(TreeNode node,int target, List<List<Integer>>ans,List<Integer>list){
        if(node==null)return;
        
        list.add(node.val);

        if(node.left==null && node.right==null){
            if(target==node.val){
                ans.add(new ArrayList<>(list));
            }
            // return;
        }
        
        
        pathSum(node.left,target-node.val,ans,list);
        pathSum(node.right,target-node.val,ans,list);
 
        list.remove(list.size()-1);
    }
}