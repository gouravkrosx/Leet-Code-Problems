/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         PriorityQueue<ListNode>pq=new PriorityQueue<>((a,b)->(a.val-b.val));
        
       for(ListNode l:lists){
           if(l!=null)
           pq.add(l);
       }
        
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        while(!pq.isEmpty()){
            ListNode rn=pq.remove();
            prev.next=rn;
             prev=prev.next;
            rn=rn.next;
            if(rn!=null){
                pq.add(rn);
            }
           
        }
        prev.next=null;
        return dummy.next; 
    }
}