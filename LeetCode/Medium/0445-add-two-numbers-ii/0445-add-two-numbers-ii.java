class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        while(l1!=null){
            st1.push(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            st2.push(l2.val);
            l2 = l2.next;
        }
        Stack<Integer> res = new Stack<>();
        int carry = 0;
        while(!st1.isEmpty() && !st2.isEmpty()){
            int sum = carry + st1.pop() + st2.pop();
            int rem = sum%10;
            res.push(rem);
            carry = sum/10;
        }
        while(!st1.isEmpty()){
            int sum = carry + st1.pop();
            int rem = sum % 10;
            res.push(rem);
            carry = sum/10;
        }
        while(!st2.isEmpty()){
            int sum = carry + st2.pop();
            int rem = sum % 10;
            res.push(rem);
            carry = sum/10;
        }
        if(carry==1) res.push(carry);
        ListNode ans = new ListNode(res.pop());
        ListNode temp = ans;
        while(!res.isEmpty()){
            temp.next = new ListNode(res.pop());
            temp = temp.next;
        }
        return ans;
    }
}