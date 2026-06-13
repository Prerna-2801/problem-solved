/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node dummy = new Node(0);
        Node tail = dummy;
        Node temp = head;
        while(temp != null){
            Node newNode = new Node(temp.val);
            tail.next = newNode;
            tail = newNode;
            temp = temp.next;
        }
        temp = head;
        Node temp1 = dummy.next;
        while(temp != null){
            if(temp.random == null){
                temp1.random = null;
            }
            else{
                int len = findPos(head, temp.random);
                Node t1 = findNode(dummy.next, len);
                temp1.random = t1;
            }
            
            temp = temp.next;
            temp1 = temp1.next;
        }
        return dummy.next;
    }
    // find position in the original LL
    public int findPos(Node head, Node r){
        if(head == null) return 0;
        Node newN = head;
        int len = 0;
        while(newN != null && newN != r){
            len++;
            newN = newN.next;
        }
        return len;
    }
    public Node findNode(Node head, int len){
        Node newN = head;
        while(len != 0){
            len--;
            newN = newN.next;
        }
        return newN;
    }
}