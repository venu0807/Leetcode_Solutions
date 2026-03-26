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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right) return head;
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
      for(int i =1;i<left;i++){
        pre = pre.next;
      }
      ListNode curr = pre.next;
      ListNode next = null;
      ListNode tail = curr;

       for(int i =0;i<=right-left;i++){

             ListNode temp = curr.next;
             curr.next = next;
             next = curr;
             curr = temp;
       }
               
                pre.next = next;
        tail.next = curr;
        return dummy.next;
    }
        
    
}