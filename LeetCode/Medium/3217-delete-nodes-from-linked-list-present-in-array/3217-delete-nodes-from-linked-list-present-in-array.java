
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums) set.add(i);
        ListNode res = new ListNode();
        ListNode temp = res;
        while(head!=null){
            if(!set.contains(head.val)){
                temp.next = new ListNode(head.val);
                temp = temp.next;;
            }
            head = head.next;
        }
        return res.next;
    }
}