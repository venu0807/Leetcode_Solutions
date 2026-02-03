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
    public ListNode insertGreatestCommonDivisors(ListNode head) {

        if (head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null){
            int gcdValue = GCD(slow.val, fast.val);
            ListNode gcdNode = new ListNode(gcdValue);
            slow.next = gcdNode;
            gcdNode.next = fast;
            slow = fast;
            fast = fast.next;
        }
        return head;

    }

    private int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}