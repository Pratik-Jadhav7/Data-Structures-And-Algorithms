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
// Approach

// Assign left pointer as list1 and traverse till you find a value
// Have middle pointer and traverse till you find b value
// Map the left to list2 and traverse till the end
// At last assign the next element of the list2 as the next element of the middle pointer
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode left = list1;
        for (int i = 1; i < a; i++)
            left = left.next;
        
        ListNode middle = left;
        for (int i = a; i <= b; i++)
            middle = middle.next;
        
		left.next = list2;
        while (list2.next != null)
            list2 = list2.next;
        
        list2.next = middle.next;
        return list1;
    }
}