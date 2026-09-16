class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int cnt = 0;
        ListNode temp = head;
        while (temp != null) {
            cnt++;
            temp = temp.next;
        }
        if (n > cnt) return head;
        int pos = cnt - n + 1;
         if (pos == 1) {
            head = head.next;
            return head;
        }
        int count = 0;
        temp = head;
        while (count != pos - 2) {
            count++;
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
