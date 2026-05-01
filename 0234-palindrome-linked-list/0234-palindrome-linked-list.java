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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        int mid = len/2;
        temp = head;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<mid; i++){
            st.push(temp.val);
            temp = temp.next;
        }
        if(len % 2 == 1) temp = temp.next;
        while(temp != null){
            if(st.pop() != temp.val){
                return false;
            }
            temp = temp.next;
        }
        return true;
    }
}