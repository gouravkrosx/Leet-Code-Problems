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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        Stack<TreeNode>sta = new Stack<>();
        Stack<TreeNode>stb = new Stack<>();
        
        fillElements(sta,root1);
        fillElements(stb,root2);
        
        List<Integer>ans = new ArrayList<>();
        
        while(!sta.isEmpty() || !stb.isEmpty()){
            
            int a = ((sta.isEmpty())?Integer.MAX_VALUE:sta.peek().val);
            int b = ((stb.isEmpty())?Integer.MAX_VALUE:stb.peek().val);
            
            if(a<b){
                ans.add(a);
                TreeNode temp = sta.pop();
                fillElements(sta,temp.right);
            }else{
                ans.add(b);
                TreeNode temp = stb.pop();
                fillElements(stb,temp.right);
            }
        }
        
        return ans;
    }
    public void fillElements(Stack<TreeNode>st,TreeNode node){
        while(node!=null){
            st.push(node);
            node=node.left;
        }
    }
}