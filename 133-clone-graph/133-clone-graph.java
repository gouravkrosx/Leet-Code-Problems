/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        
        Node[]vis=new Node[1000];//as we don't know the exact size;
        if(node==null)
            return node;
        
        Node copy=new Node(node.val);
        
        vis[node.val]=copy;
        
        //looping through adjacent nodes of original graph because they contain neighbours;
        for(Node an:node.neighbors){
            if(vis[an.val]==null){
             Node newnode=new Node(an.val);
                copy.neighbors.add(newnode);
                dfs(an,newnode,vis); //we are passing original graph also.(an->adjacent node)
            }else{
                copy.neighbors.add(vis[an.val]);
            }
        }
        
        return copy;
    }
    //an is from original array which contains aj_list of neighbors, whereas
    //nn contain empty list but same value as an.
    public void dfs(Node an,Node nn,Node[]vis){
        vis[nn.val]=nn;
        
        for(Node cn:an.neighbors){
            if(vis[cn.val]==null){
                Node newnode=new Node(cn.val);
                nn.neighbors.add(newnode);
                dfs(cn,newnode,vis);
            }else{
             nn.neighbors.add(vis[cn.val]);   
            }
        }
    }
}