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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)return head;
        
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        
        ListNode curr = head;
        ListNode ahead = curr.next;

        prev.next = curr;
        

        
        boolean flag = false;
        
        while(ahead!=null){
            if(ahead.val==curr.val){
                ahead=ahead.next;
                flag = true;
            }else{
                if(flag){
                    prev.next = ahead;
                    curr = ahead;
                    ahead = ahead.next;
                }else{
                    prev.next = curr;
                    prev = curr;
                    curr = ahead;
                    ahead = ahead.next; 
                }
                flag = false;
            }
        }
        
        if(flag){
            prev.next = ahead;
        }
        
        return dummy.next;
    }
}