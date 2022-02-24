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
    public ListNode sortList(ListNode head) {
        return MergeSort(head);
    }
    
    public ListNode MergeSort(ListNode head){
        if(head==null||head.next==null){
            return head;    
        }
        
        ListNode mid=midNode(head);
        ListNode nhead=mid.next;
        mid.next=null;
        
        ListNode fh=MergeSort(head);
        ListNode sh=MergeSort(nhead);
    
        return MergeLL(fh,sh);
    }
    
    public ListNode midNode(ListNode head){
        ListNode fast= head;
        ListNode slow= head;
        
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return slow;
    }
    //Merge Sort in constant Space complexity
    public ListNode MergeLL(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                prev.next=l1;
                l1=l1.next;
            }else{
                prev.next=l2;
                l2=l2.next;
            }
            prev=prev.next;
        }
        
        prev.next=(l1!=null)?l1:l2;
        return dummy.next;
    }
}