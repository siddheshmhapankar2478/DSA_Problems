package A06_Linked_List.A6_Linked_List_Questions;

public class Q24_Add_a_Number {
    class Node {
        public int data;
        public Node next;
        public Node child;

        Node()
        {
            this.data = 0;
            this.next = null;
            this.child = null;
        }
        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.child = null;
        }
        Node(int data, Node next, Node child)
        {
            this.data = data;
            this.next = next;
            this.child = child;
        }
    }
    
	public static Node reverse(Node head) {
		if(head==null||head.next==null){
			return head;
		}
		Node prev=null,curr=head,nxt=head.next;
		while(curr!=null){
			curr.next=prev;
			prev=curr;
			curr=nxt;
			if(nxt!=null)
				nxt=nxt.next;
		}
		return prev;
	}
	public Node addOne(Node head) {
		Node reverseLL=reverse(head);
		Node temp=reverseLL,prev=null;
		int carry=1;
		while(temp!=null){
			int sum=temp.data+carry;
			temp.data=sum%10;
			carry=sum>9?1:0;
			prev=temp;
			temp=temp.next;
		}
		if(carry==1){
			Node newNode=new Node(1);
			prev.next=newNode;
		}
		Node orignalLL=reverse(reverseLL);
		return orignalLL;
	}
}
