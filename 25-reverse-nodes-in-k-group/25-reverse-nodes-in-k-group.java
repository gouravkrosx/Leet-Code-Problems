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
    public ListNode reverseKGroup(ListNode head, int k) {
       if(head==null||k==1){
           return head;
       }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
       
        ListNode curr=dummy,pre=dummy,next=dummy;
        int count=0;
        while(curr.next!=null){
            count++;
            curr=curr.next;
        }  
        int size = count;    
        
       while(count>=k){
            if(count>=k){
            curr=pre.next;
            next=curr.next;
            for(int i=1;i<=k-1 && curr.next!=null;i++){ //as we want to change k-1 links
                curr.next=next.next;
                next.next=pre.next;
                pre.next=next;
                next=curr.next;               
            }
            pre=curr;              
            count-=k; 
            continue;    
          }
            k = count;   
            curr=pre.next;
            next=curr.next;
            for(int i=1;i<=k-1 && curr.next!=null;i++){ //as we want to change k-1 links
                curr.next=next.next;
                next.next=pre.next;
                pre.next=next;
                next=curr.next;               
            }
            pre=curr; 
            break;                    
        }                    
        return dummy.next;
    }
}