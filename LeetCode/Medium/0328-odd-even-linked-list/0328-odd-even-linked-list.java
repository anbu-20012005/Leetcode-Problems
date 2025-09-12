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
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
       ListNode odd = head;
       ListNode even = head.next;
       ListNode oddres = new ListNode(odd.val);
       ListNode evenres = new ListNode(even.val);
       ListNode temp = oddres;
       ListNode tem = evenres;
       while( (even!=null &&  even.next!=null && even.next.next!=null) || (odd!=null &&  odd.next!=null && odd.next.next!=null)){
            if(odd.next.next!=null){
            odd = odd.next.next;
            temp.next = new ListNode(odd.val);
            temp = temp.next;
            }
            if(even.next.next!=null){
            even = even.next.next;
            tem.next = new ListNode(even.val);
            tem = tem.next;
            }
       }
       temp.next = evenres;
       return oddres;
    }
}