/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node itr=head;
        Node front=head;
      // First round: make copy of each node,
     // and link them together side-by-side in a single list.
    
        while(itr!=null){
          front =itr.next;
          Node nn=new Node(itr.val);
          itr.next=nn;
          nn.next=front;
          itr=front;         
        }
        
        // Second round: assign random pointers for the copy nodes.
        itr=head;
        while(itr!=null){
            if(itr.random!=null){
                itr.next.random=itr.random.next;
            }
            itr=itr.next.next;
        }
        
        // Third round: restore the original list, and extract the copy list.
        Node pseudoHead=new Node(0);
        itr=head;
        Node copy=pseudoHead;
        while(itr!=null){
           front=itr.next.next;
            
            //extract the copy
            copy.next=itr.next;
            copy=copy.next;
            
            //restore the original list
            itr.next=front;
            
            itr=front;
        }
        
        return pseudoHead.next;
    }
}