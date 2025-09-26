class Solution {
    public ListNode doubleIt(ListNode head) {
        int carry = doubleHelper(head);
        if(carry > 0) {
            ListNode newHead = new ListNode(carry);
            newHead.next = head;
            return newHead;
        }
        return head;
    }
    private int doubleHelper(ListNode node) {
        if(node == null) return 0;

        int carry = doubleHelper(node.next); 
        int total = node.val * 2 + carry;
        node.val = total % 10;
        return total / 10;
    }
}
