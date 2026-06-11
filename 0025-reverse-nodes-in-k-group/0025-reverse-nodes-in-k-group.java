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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0);
        ListNode temp = head, t1 = head, t2 = dummy;
        int cnt = 1;
        while(t1 != null){
            if(cnt == k){
                head = t1.next;
                t1.next = null;
                ListNode newN = reverse(temp);
                t2.next = newN;
                while(t2.next != null) t2 = t2.next;
                cnt = 1;
                temp = head;
                t1 = head;
            }
            else{
                t1 = t1.next;
                cnt++;
            }
        }
        if(temp != null){
            t2.next = temp;
        }
        return dummy.next;
    }
    public ListNode reverse(ListNode l){
        ListNode prev = null;
        ListNode curr = l;
        ListNode next;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}