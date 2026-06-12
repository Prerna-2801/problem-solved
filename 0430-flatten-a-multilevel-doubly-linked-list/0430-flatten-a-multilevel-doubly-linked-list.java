/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head == null) return null;
        Node curr = head;
        Node nextNode;
        while(curr != null){
            while(curr.child != null){
                nextNode = curr.next;
                curr.next=flatten(curr.child);
                curr.next.prev=curr;
                curr.child=null;
                while(curr.next!=null){
                    curr=curr.next;
                }
                if(nextNode!=null){
                    curr.next=nextNode;
                    nextNode.prev=curr;
                }
            }
            curr=curr.next;
        }
        return head;
    }
}