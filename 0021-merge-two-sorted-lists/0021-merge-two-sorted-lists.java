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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> a = new ArrayList<>();
        ListNode temp = list1;
        while(temp != null){
            a.add(temp.val);
            temp = temp.next;
        }
        temp = list2;
        while(temp != null){
            a.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(a);
        ListNode dummy = new ListNode();
        temp = dummy;
        for(int i = 0; i<a.size(); i++){
            temp.next = new ListNode(a.get(i));
            temp = temp.next;
        }
        return dummy.next;
    }
}