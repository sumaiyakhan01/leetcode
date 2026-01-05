class Solution {
    public ListNode removeElements(ListNode head, int val) {
        // Dummy node to handle removal of head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode current = dummy;
        
        while (current.next != null) {
            if (current.next.val == val) {
                // Remove node
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        return dummy.next;
    }
}
