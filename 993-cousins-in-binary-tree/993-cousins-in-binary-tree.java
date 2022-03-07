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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode>q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            int len=q.size();
            boolean a_exist=false;
            boolean b_exist=false;
            
            for(int i=0;i<len;i++){
                TreeNode curr = q.poll();
                
                if(curr.val==x)a_exist = true;
                if(curr.val==y)b_exist = true;
                
                if(curr.left!=null && curr.right!=null){
                    if(( (curr.left.val==x) && (curr.right.val==y) ) 
                       ||( (curr.left.val==y) && (curr.right.val ==x) ))
                        return false;
                }
                
                if(curr.left!=null)q.add(curr.left);
                
                if(curr.right!=null)q.add(curr.right);

            }
            //here below line means both were there in the same level and also remained true hence cousins
            if(a_exist && b_exist)return true;
        }
        return false;
    }
}