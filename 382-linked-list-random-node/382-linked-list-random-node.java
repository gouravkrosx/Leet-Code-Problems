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

    private ArrayList<Integer> list;
    public Solution(ListNode head) {
        list=new ArrayList<>();
        
        ListNode curr=head;
             
        while(curr!=null){
                list.add(curr.val);
                curr=curr.next; 
        }
    }
    
    public int getRandom() {
        
        int size=list.size();
        
        int idx=(int)(Math.random()*size);
        
        return list.get(idx);
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */