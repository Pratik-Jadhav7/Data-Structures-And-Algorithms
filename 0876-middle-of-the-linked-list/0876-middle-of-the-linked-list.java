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




//  JAVA Brute Force Code:-

// class Solution {
//     public ListNode middleNode(ListNode head) {
//         ListNode temp = head;
//         int length=0;
// 		//Traversing temp till the end of linked list to find length #O(n)
//         while(temp!=null){
//             temp = temp.next;
//             length++;
//         }
//         int middle = length/2;
//         temp=head;
//         //traversing temp node back to middle node #O(n/2)
//         while(middle != 0){                
//          temp = temp.next;
//          middle--;
//         }
//         return temp;
//     }
// }
// Time Complexity: O(N)+O(N/2) = O(N)
// Space Complexity: O(1)
    
    
    
    
    // By Two Pointer Algortihm
    
    // JAVA CODE:-

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
		// slow moving 1 step at a time while fast is moving 2 steps at a time #O(N/2)
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
// Time Complexity: O(N/2)=O(N)
// Space Complexity: O(1)

