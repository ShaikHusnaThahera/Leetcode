class Solution {

    public static ListNode reverse(ListNode head, int count) {
        ListNode prev = null;
        ListNode temp = head;

        while (count > 0) {
            ListNode f = temp.next;
            temp.next = prev;
            prev = temp;
            temp = f;
            count--;
        }
        head.next = temp;
        return prev;
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == 1) {
            return reverse(head, right);
        }
        int count = 1;
        ListNode temp = head;
        while (count < left - 1) {
            temp = temp.next;
            count++;
        }
        temp.next = reverse(temp.next, right - left + 1);

        return head;
    }
}