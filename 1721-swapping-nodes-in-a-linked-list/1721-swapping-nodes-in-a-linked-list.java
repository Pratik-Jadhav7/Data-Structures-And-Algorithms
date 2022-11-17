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
        ListNode A = head, B = head, nodeK;
        for (int i = 1; i < k; i++) A = A.next;
        nodeK = A;
        A = A.next;
        while (A != null) {
            A = A.next;
            B = B.next;
        }
        int temp = nodeK.val;
        nodeK.val = B.val;
        B.val = temp;
        return head;
    }
}