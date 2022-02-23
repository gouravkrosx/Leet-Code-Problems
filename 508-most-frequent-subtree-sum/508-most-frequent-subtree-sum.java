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
    public int[] findFrequentTreeSum(TreeNode root) {
        HashMap<Integer,Integer>map = new HashMap<>();
        List<Integer>list = new ArrayList<>();
        
        mostFrequentTreeSum(root,map);
        
        Set<Integer>set = new HashSet<>();
        set.addAll(map.values());
        
        int[]res;
        if(set.size()==1){
            int size = map.size();
            res= new int[size];
            int i=0;
            for(int key:map.keySet()){
                res[i++]=key;
            }
        }else{
            int max = Integer.MIN_VALUE;
            for(int val:map.values()){
                max = Math.max(val,max);
            }
            
            for(int key:map.keySet()){
                if(map.get(key)==max)list.add(key);
            }
            res = new int[list.size()];
            int i=0;
            for(int key:list){
                res[i++]=key;
            }
        }
        return res;
    }
    public int mostFrequentTreeSum(TreeNode node,HashMap<Integer,Integer>map){
        if(node==null)return 0;
        
        int left = mostFrequentTreeSum(node.left,map);
        int right = mostFrequentTreeSum(node.right,map);
  
        int sum = left + right + node.val;
        
        map.put(sum,map.getOrDefault(sum,0)+1);
        return sum;
    }
}