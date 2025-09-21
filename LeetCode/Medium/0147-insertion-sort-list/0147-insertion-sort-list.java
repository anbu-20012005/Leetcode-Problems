
class Solution {
    public ListNode insertionSortList(ListNode head) {
        ListNode res = new ListNode();
        while(head!=null){
            ListNode temp = res;
            while(temp!=null && temp.next!=null && temp.next.val<=head.val){
                temp = temp.next;
            }
            ListNode insert = new ListNode(head.val);
            ListNode hold = temp.next;
            temp.next = insert;
            insert.next = hold;
            head = head.next;
        }
        return res.next;
    }
}