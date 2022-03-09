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
        
    ListNode dummy = new ListNode(0), curr = head, prev = dummy;
        prev.next = curr;
        while(curr != null) {
            while (curr.next != null && curr.val == curr.next.val) {
                curr = curr.next;    //while loop to find the last node of the dups.
            }
            if (prev.next != curr) { //duplicates detected.
                prev.next = curr.next; //remove the dups.
                curr = curr.next;     //reposition the curr pointer.
            } else { //no dup, move down both pointer.
                prev = prev.next;
                curr = curr.next;
            }

        }
        return dummy.next;
    }
}