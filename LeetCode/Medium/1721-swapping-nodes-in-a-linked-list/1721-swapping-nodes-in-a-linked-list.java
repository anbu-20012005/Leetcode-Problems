
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        ListNode first = head;
        for(int i=1;i<k;i++){
            first = first.next;
        }
        ListNode second = head;
        for(int i=1;i<count-k+1;i++){
            second = second.next;
        }
        int store = first.val;
        first.val = second.val;
        second.val = store;
        return head;
    }
}