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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode myList = new ListNode(0);
        ListNode t3 = myList;
        int carry = 0;
        while (t1 != null || t2 != null || carry != 0) {
            int sum = carry;
            if (t1 != null) {
                sum += t1.val;
                t1 = t1.next;
            }
            if (t2 != null) {
                sum += t2.val;
                t2 = t2.next;
            }
            carry = sum / 10;
            ListNode n = new ListNode(sum % 10);
            t3.next = n;
            t3 = t3.next;
        }
        return myList.next;
    }
}