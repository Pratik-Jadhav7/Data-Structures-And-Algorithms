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
        ListNode curr1 = list1;
        
        //find the ath prev node and bth next node of list 1
        ListNode athPrevNode = null;
        ListNode bthNextNode = null;
        int i = 0;
        while(curr1 != null){
            if(i == a - 1){
                athPrevNode = curr1;
            }
            
            if(i == b + 1){
                bthNextNode = curr1;
                break;
            }
            
            curr1 = curr1.next;
            i++;
        }
        
        //find last node of list 2
        ListNode curr2 = list2;
        while(curr2 != null && curr2.next != null){
            curr2 = curr2.next;
        }
        
        //now insert list2 in list 1
        athPrevNode.next = list2;
        curr2.next = bthNextNode;
        
        return list1;
    }
}