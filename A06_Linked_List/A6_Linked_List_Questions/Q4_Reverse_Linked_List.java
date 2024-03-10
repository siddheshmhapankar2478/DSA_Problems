package A06_Linked_List.A6_Linked_List_Questions;

public class Q4_Reverse_Linked_List {
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
    //Iterative
    public static Node reverseLinkedList(Node head)
    {
        if(head==null||head.next==null)
            return head;
        Node prev=null;
        Node curr=head;
        Node nxt=head.next;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=nxt;
            if(nxt!=null)
                nxt=nxt.next;
        }
        return prev;
    }
    //Using Recurrsion
    public static Node recurrsion(Node prev,Node curr){
        if(curr==null)
            return prev;
        Node nxt=curr.next;
        curr.next=prev;
        return recurrsion(curr,nxt);
    }
}
