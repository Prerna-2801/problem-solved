/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = len(headA);
        int lenB = len(headB);
        int diff = 0;
        ListNode temp = null;
        ListNode temp2 = null;
        if(lenA > lenB){
            diff = lenA - lenB;
            temp = headA;
            for(int i = 0; i<diff; i++){
                temp = temp.next;
            }
            temp2 = headB;
        }
        else{
            diff = lenB - lenA;
            temp = headB;
            for(int i = 0; i<diff; i++){
                temp = temp.next;
            }
            temp2 = headA;
        } 
        while(temp != null && temp2 != null){
            if(temp == temp2) return temp;
            temp = temp.next;
            temp2 = temp2.next;
        }
        return null;
    }
    public int len(ListNode t1){
        if(t1 == null) return 0;
        ListNode temp = t1;
        int cnt = 0;
        while(temp != null){
            cnt++;
            temp = temp.next;
        }
        return cnt;
    }
}