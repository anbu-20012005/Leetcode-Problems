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
    public int[] nextLargerNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp = head;
        int count = 0;
        while(temp!=null){
            temp  = temp.next;
            count++;
        }
        temp = head;
        int[] arr = new int[count];
        int[] res = new int[count];
        for(int i=0;temp!=null;i++){
            arr[i] = temp.val;
            temp = temp.next;
        }
        for(int i=0;i<count;i++){
            while(!st.isEmpty() && arr[st.peek()]<arr[i]){
                int ind = st.pop();
                res[ind] = arr[i];
            }
            st.push(i);
        }
        return res;
    }
}