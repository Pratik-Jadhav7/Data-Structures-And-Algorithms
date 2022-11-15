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
    public ListNode deleteMiddle(ListNode head) {
        // Odd - 5 length - [1,2,3,4,5]
        // Even - 4 length - [1,2,3,4]
        // Odd - 1 length - [1]
        // Even - 2 length - [1,2]
        
        // Use the concept of slow and fast pointer where in this case, the fast pointer is moving ahead at twice the speed of the slow pointer
        
        // slow = slow.next [1 --> 2 --> 3 --> 4 --> 5]
        // fast = fast.next.next; [1 --> 3 --> 5 --> 7 --> 9]
        
        // 0 or 1 elements in the list
        if (head == null || head.next == null)
            return null;
        
        // When there are 2 or more elements
        
        ListNode slow = head;
        ListNode fast = head;
        
        // prev slow is the pointer which is 1 behind the middle point
        // so for e.g - [1,2,3,4,5] (odd length case) = when slow reaches 3, prev_slow is at 2 and we can delete 3 by 2.next = 3.next, i.e - [2 --> 4]
        // similarly - [1, 2, 3, 4] (even length case) = when slow reaches 3, prev_slow is at 2 and we can delete 3 by 2.next = 3.next, i.e - [2 --> 4]
        ListNode prevSlow = null;
        
        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        
        prevSlow.next = slow.next;
        return head;
    }
}