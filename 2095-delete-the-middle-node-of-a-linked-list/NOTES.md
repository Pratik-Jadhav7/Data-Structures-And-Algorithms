​Q1: Why do you use a prev and dummy variable for this as it's taking extra space? The following code is good enough without them:

    public ListNode deleteMiddle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode slow = head, fast = head.next.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
A1: For this specific problem we are given a constraint The number of nodes in the list is at least 1. Therefore the above code is perfect without using prev or dummy.
My code is implemented for more general cases including empty list, in which case a dummy head is necessary.

Q2: Most of the solutions just skip the node to be deleted.
To properly delete the node :

ListNode y = slow.next.next;  //delete_node_after_slow_node
slow.next.next = null;
slow.next = y;
A2: Excellent critical comment. Actually there is an ambiguous point about the delete: after deleting from the list, terminate the life of the object or not?
You use an explicit way to terminate the object, and most others just overwrite the corresponding reference, and GC will take care of the object if there is no reference to it, otherwise the object will be still alive out of the list.

End of Q & A

Method 1: Two pointers

Create a dummy head, and initialize slow and fast pointers as dummy;
Traverse the ListNodes starting from dummy by the afore-mentioned two pointers, slow forwards 1 step and fast forwards 2 steps per iteration;
Terminate the traversal till fast.next or fast.next.next is null, and now slow points to the previous node of the middle node; remove the middle node;
Return dummy.next as the result.
    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(-1), slow = dummy, fast = dummy; 
        dummy.next = head;
        while (fast.next != null && fast.next.next != null) {  
            slow = slow.next; 
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return dummy.next; 
    }
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = slow = fast = ListNode(-math.inf)
        dummy.next = head
        while fast.next and fast.next.next:
            slow = slow.next
            fast = fast.next.next
        slow.next = slow.next.next    
        return dummy.next
Method2: Three pointers - inspired by @Zudas.

Add a prev pointers following slow one.

    public ListNode deleteMiddle(ListNode head) {
        ListNode dummy = new ListNode(-1), prev = dummy, slow = head, fast = head;
        prev.next = head;
        while (fast != null && fast.next != null) {  
            prev = slow;
            slow = slow.next; 
            fast = fast.next.next;
        }
        prev.next = slow.next;
        return dummy.next;       
    }
    def deleteMiddle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        dummy = prev = ListNode(-math.inf)
        slow = fast = head
        prev.next = slow
        while fast and fast.next:
            prev = slow
            slow = slow.next
            fast = fast.next.next
        prev.next = slow.next
        return dummy.next
Analysis:

Time: O(n), space: O(1), where n = # of the nodes.
