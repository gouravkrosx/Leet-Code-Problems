// { Driver Code Starts
//Initial template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GFG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t > 0){
            String s = br.readLine();
            Node root = buildTree(s);
            
            String line = br.readLine();
            String[] splitLine = line.split(" ");
            int nd1 = Integer.parseInt(splitLine[0]);
            int nd2 = Integer.parseInt(splitLine[1]);
            int turn;

            Solution ob = new Solution();
            if((turn = ob.NumberOfTurns(root, nd1, nd2)) != 0)
              System.out.println(turn);
            else
              System.out.println("-1");
            t--;
        }
    }
}
// } Driver Code Ends


//User function Template for Java
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class Solution
{
    static int NumberOfTurns(Node root, int first, int second)
    {
        int[] count = new int[]{0};
        
        Node lca = LCA(root,first,second);
        
        if(lca==null)return -1;
        
        if(lca.data!=first && lca.data!=second){
            countTurns(lca.left,first,true,count);
            countTurns(lca.right,first,false,count);
            
            countTurns(lca.left,second,true,count);
            countTurns(lca.right,second,false,count);
            
            return count[0]+1;
        }
        
        if(lca.data==first){
            countTurns(lca.left,second,true,count);
            countTurns(lca.right,second,false,count);
        }else{
            countTurns(lca.left,first,true,count);
            countTurns(lca.right,first,false,count);
            
        }
        return count[0];
    }
    
    public static boolean countTurns(Node node,int tar,boolean turn,int[]count){
        if(node==null)return false;
        
        if(node.data==tar)return true;
        
        if(turn){
            if(countTurns(node.left,tar,turn,count))return true;
            if(countTurns(node.right,tar,!turn,count)){
                count[0]++;
                return true;
            }
        }else{
            if(countTurns(node.right,tar,turn,count))return true;
            if(countTurns(node.left,tar,!turn,count)){
                count[0]++;
                return true;
            }
        }
        return false;
    }
    
    public static Node LCA(Node node,int a,int b){
        if(node==null)return null;
        
        if(node.data==a || node.data==b){
            return node;
        }
        
        Node left = LCA(node.left,a,b);
        Node right = LCA(node.right,a,b);
        
        if(left!=null && right!=null){
            return node;
        }
        
        return (left!=null)?left:right;
    }
}