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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0){
            return head;
        }

        ListNode curr = head;
        int len = 1;
        while(curr.next != null){
            curr = curr.next;
            len += 1;
        }

        k %= len;
        if (k == 0){
            return head;
        }
        // make the list circular
        curr.next = head;
        // traverse till k
        curr = head;
        for(int i = 1; i < len - k; i++){
            curr = curr.next;
        }

        head = curr.next;
        curr.next = null;

        return head;
    }
}
