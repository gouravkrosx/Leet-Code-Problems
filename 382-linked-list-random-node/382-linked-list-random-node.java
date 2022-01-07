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

    //for better understanding of this algo
    // -> https://www.youtube.com/watch?v=A1iwzSew5QY
    
    private ListNode head;
    private Random rn;
    public Solution(ListNode h) {
    
        head=h;
        rn=new Random();
        
    }
    
    public int getRandom() {
        if(head==null)return 0;
        
        ListNode curr = head;
        int r=curr.val;
        
        for(int i=1;curr.next!=null;i++){
            curr=curr.next;
            
            if(rn.nextInt(i+1)==1)r=curr.val;
        }
        return r;       
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */