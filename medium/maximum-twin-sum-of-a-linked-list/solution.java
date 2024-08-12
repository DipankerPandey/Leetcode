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
    public int pairSum(ListNode head) {
        ListNode headCopy = new ListNode(head.val);
        ListNode cur = head.next;
        ListNode curCopy = headCopy;
        // make a copy
        int size = 1;
        while (cur != null) {
            ListNode nextCopy = new ListNode(cur.val);
            curCopy.next = nextCopy;
            curCopy = nextCopy;
            cur = cur.next;
            size++;
        }
        // reverse a copy
        cur = headCopy;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        ListNode headOfReversed = prev;
        // find max
        int max = 0;
        size = size / 2;
        while (size != 0) {
            max = Math.max(max, headOfReversed.val + head.val);
            headOfReversed = headOfReversed.next;
            head = head.next;
            size--;
        }
        return max;
    }
}