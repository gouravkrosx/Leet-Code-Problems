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
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null)return head;
        
        ListNode even = new ListNode(0);
        ListNode odd = new ListNode(0);
        ListNode ei = even, oi=odd;
        
        int count=0;
        ListNode curr = head;
        while(curr!=null){
            
            if(count%2==0){
                ei.next = curr;
                ei = ei.next;
            }else{
                oi.next = curr;
                oi = oi.next;
            }
            count++;
            curr = curr.next;
        }
        
        // to break the further links
        ei.next = null;
        oi.next = null;
        
        
        ListNode ans = new ListNode(0);
        ListNode ai = ans;
        
        ListNode eh = even.next;
        ListNode oh = odd.next;
       
        
        while(eh!=null && oh!=null){
            
                ai.next = oh;
                oh = oh.next;
                ai = ai.next;
        
                ai.next = eh;
                eh = eh.next;
                ai = ai.next;            
        }
        
        if(eh!=null)ai.next = eh;
        
        return ans.next;
    }
}