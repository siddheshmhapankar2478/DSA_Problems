package A06_Linked_List.A6_Linked_List_Questions;
import java.util.ArrayList;
import java.util.Collections;

public class Q23_Flatten_A_LL {
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
    public Node flattenLinkedList(Node head) {
        Node temp=head;
        ArrayList<Integer> arr=new ArrayList<>();
        while(temp!=null){
            Node tempChild=temp;
            while(tempChild!=null){
                arr.add(tempChild.data);
                tempChild=tempChild.child;
            }
            temp=temp.next;
        }
        Collections.sort(arr);
        Node ansHead=null;
        Node ansTail=null;
        
        for(int i=0;i<arr.size();i++){
            int val=arr.get(i);
            Node newNode=new Node(val);
            if(ansHead==null&&ansTail==null){
                ansHead=newNode;
                ansTail=newNode;
            }
            else{
                ansTail.child=newNode;
                ansTail=newNode;
            }
        }
        return ansHead;
    }
}
