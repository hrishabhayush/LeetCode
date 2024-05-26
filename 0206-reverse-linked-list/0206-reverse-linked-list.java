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
    public ListNode reverseList(ListNode head) {
        
        // Iterative solution
//         ListNode node = null; 
        
//         while (head != null) {
//             ListNode temp = head.next;
//             head.next = node;
//             node = head;
//             head = temp;
//         }
        
//         return node;
            
        // Recursive approach 
        
        if (head == null || head.next == null) {
            return head;
        }
        
        
        ListNode node = reverseList(head.next);
        
        //head.next is the last node in the list, so we need to make it's next node to be the last node
        head.next.next = head;
        //After the update, update the last node's next node.
        head.next = null;
        
        return node;
    }
}