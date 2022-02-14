/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
     
    Node level_start = root;
        
    while(level_start!=null){
        Node curr = level_start;

        while(curr!=null){
            if(curr.left!=null) curr.left.next = curr.right;  //this makes the link from left subtree to right subtree
            if(curr.right!=null && curr.next!=null) curr.right.next = curr.next.left;  //through this we go to right side.
            curr = curr.next; //now going to right subtree 
        }
        level_start = level_start.left; //since we link every level starting from extreme left.
    }
        
        return root;
    }
}