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
    public int sumRootToLeaf(TreeNode root) {
        if(root==null){
            return 0;
        }
        
        ArrayList<String>list = new ArrayList<>();
        String path = "0";        
        sumRootToLeaf(root,path,list);
        return findSum(list);
    }
    public void sumRootToLeaf(TreeNode node, String path, ArrayList<String>list){
        if(node==null){
            return;
        }
        if(node.left==null && node.right==null){
            list.add(path+node.val); 
            return;
        }
        
        sumRootToLeaf(node.left,path+node.val,list);
        sumRootToLeaf(node.right,path+node.val,list);
    }
    public int findSum(ArrayList<String>list){
        int sum=0;
        for(String str:list){
            if(str!=null)
            sum+=Integer.parseInt(str,2);
        }
        return sum;
    }
}