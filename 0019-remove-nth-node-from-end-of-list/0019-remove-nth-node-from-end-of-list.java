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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        
        if (n == size) {
            return head.next;
        }
        
        temp = head;
        
        // Loop through the linked list until we find the node that we want to remove
        for (int i = 1; i < size - n; i++) {
            temp = temp.next;
        }
        
        // Handle the nth node 
        temp.next = temp.next.next;
        
        return head;
            
    }
}