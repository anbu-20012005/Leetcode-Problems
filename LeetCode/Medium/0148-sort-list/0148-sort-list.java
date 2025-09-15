class Solution {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode t = head;
        while(head!=null){
            list.add(head.val);
            head = head.next;
        }
        Collections.sort(list);
        ListNode temp = new ListNode();
        ListNode res = temp;
        for(int i : list){
            res.next = new ListNode(i);
            res = res.next;
        }
        return temp.next;
    }
}