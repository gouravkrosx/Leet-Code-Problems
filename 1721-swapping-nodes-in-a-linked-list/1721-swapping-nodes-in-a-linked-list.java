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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode firstPrev = dummy;
        for (int i = 0; i < k - 1; i++) {
            firstPrev = firstPrev.next;
        }

        ListNode secondPrev = dummy;
        ListNode advanced = firstPrev.next.next;
        while (advanced != null) {
            secondPrev = secondPrev.next;
            advanced = advanced.next;
        }

        ListNode first = firstPrev.next;
        ListNode second = secondPrev.next;
        ListNode firstNodeAfter = first.next;
        ListNode secondNodeAfter = second.next;
        
        if (second.next == first) {  //case when second node crossed first like eg: [5,2] and k = 2;
            secondPrev.next = first;
            first.next = second;
            second.next = firstNodeAfter;
        } else if (secondPrev == first) {  //in case of adjacent nodes.
            firstPrev.next = second;
            second.next = first;
            first.next = secondNodeAfter;
        } else {            // general case
            firstPrev.next = second;
            second.next = firstNodeAfter;
            secondPrev.next = first;
            first.next = secondNodeAfter;
        }


        return dummy.next;
    }
}