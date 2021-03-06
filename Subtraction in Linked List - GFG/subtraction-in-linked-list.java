// { Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.subLinkedList(first, second);
            printList(res);
        }
    }
}
// } Driver Code Ends


/* Structure of Linked list node

class Node
{
	int data;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}

*/
class Solution {
    Node subLinkedList(Node l1, Node l2) {

        l1 = skipLeadingZero(l1);
        l2 = skipLeadingZero(l2);

        int s1 = size(l1);
        int s2 = size(l2);

        if (s1 < s2) return subLinkedList(l2, l1);
        else if (s1 == s2) {
            if (sumDigit(l1) < sumDigit(l2))
                return subLinkedList(l2, l1);
        }

        l1 = reverse(l1);
        l2 = reverse(l2);

        Node ansHead, ansTail;
        ansHead = ansTail = new Node(-1);

        while (l2 != null && l1 != null) {
            if (l1.data < l2.data) {
                l1.data += 10;
                adjustBorrow(l1.next);
            }

            ansTail.next = new Node(l1.data - l2.data);
            ansTail = ansTail.next;

            l1 = l1.next;
            l2 = l2.next;
        }

        ansTail.next = l1;

        ansHead = reverse(ansHead.next);
        ansHead = skipLeadingZero(ansHead);

        return (ansHead == null) ? new Node(0) : ansHead;
    }

    static long sumDigit(Node head) {
        long s = 0;
        while (head != null) {
            s = s + head.data;
            head = head.next;
        }
        return s;
    }

    static int size(Node head) {
        int s = 0;
        while (head != null) {
            s++;
            head = head.next;
        }
        return s;
    }

    static Node reverse(Node head) {
        if (head == null || head.next == null) return head;

        Node tail = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return tail;
    }

    void adjustBorrow(Node node) {
        while (node != null && node.data == 0) {
            node.data = 9;
            node = node.next;
        }
        if (node != null)
            node.data--;
    }

    Node skipLeadingZero(Node head) {
        while (head != null && head.data == 0) {
            head = head.next;
        }
        return head;
    }
}