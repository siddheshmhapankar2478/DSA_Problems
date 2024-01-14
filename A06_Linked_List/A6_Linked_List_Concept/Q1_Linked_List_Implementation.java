package A06_Linked_List.A6_Linked_List_Concept;
import java.util.HashMap;

class Node{
    int val;
    Node next,random;
    Node(){}
    Node(int val){
        this.val=val;
        this.next=null;
        this.random=null;
    }
}
class LinkedList{
    Node head;
    LinkedList(){
        this.head=null;
    }
    void display(){
        Node curr = head;
        if(curr==null)
            System.out.println("List is empty");
        while(curr!=null){
            System.out.print(curr.val+" ");
            curr=curr.next;
        }
    }
    void insert(int val){
        Node newNode = new Node(val);
        if(head==null)
            head=newNode;
        else{
            Node curr = head;
            while(curr.next!=null)
                curr=curr.next;
            curr.next=newNode;
        }
    }
    void insertAtPos(int val,int pos){
        Node newNode = new Node(val);
        if(pos==1){
            newNode.next=head;
            head=newNode;
            return;
        }
        int count=1;
        Node curr=head;
        while(count!=pos-1&&curr!=null){
            count++;
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }

    void deleteElement(int val){
        if(head==null)
            return;
        if(head.val==val){
            head=head.next;
            return;
        }
        Node curr=head;
        Node prev=null;
        while(curr!=null){
            if(curr.val==val){
                prev.next=curr.next;
            }
            prev=curr;
            curr=curr.next;
        }
    }
    //Q1 Delete Node in a Linked List
    public void deleteNode(Node node) {
        
        node.val=node.next.val;        
        node.next=node.next.next;
    }
    //Q3 Remove Linked List Elements
    public Node removeElements(Node head, int val) {
        while (head != null && head.val == val)
            head = head.next;

        Node temp = head;
        Node prev = null;
        while (temp != null) {
            if (temp.val == val) 
                prev.next = temp.next;
            else 
                prev = temp;
            
            temp = temp.next;
        }

        return head;
    }
    //Q4 Reverse Linked List
    public Node reverseList(Node head) {
        Node prev=null;
        Node curr=head;
        Node nxt=curr.next;
        if (head == null || head.next == null)
           return head;
        while(curr!=null){
            curr.next=prev;
            prev=curr;
            curr=nxt;
            if(nxt!=null)
                nxt=nxt.next;
        }
        return prev;
    }
    // Q2 Middle of the Linked List
    public Node middleNode(Node head) {
        Node fast=head;
        Node slow=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    // Q5 Palindrome LinkedList 
    public boolean isPalindrome(Node head) {
        Node middle=middleNode(head);
        Node reverse=reverseList(middle);
        Node temp1=reverse;
        Node temp2=head;
        
        while(temp1!=temp2&&temp1!=null&&temp2!=null){
            if(temp1.val!=temp2.val)
                return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
        
    }
    // Q6 LinkedList Cycle
    public boolean hasCycle(Node head) {
        if(head==null||head.next==null)
            return false;
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow)
                return true;
        }
        return false;
    }
    // Q7 LinkedList Cycle 2
    public Node detectCycle(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                    slow=slow.next;
                    fast=fast.next;
                }
                return slow;
            }

        }
        return null;
    }
    //Q8 Copy List with Random Pointers
    public Node copyRandomList(Node head) {
        Node temp=head;
        Node headDeep=null;
        Node newNode=null;

        HashMap<Node,Node> hm=new HashMap<>();
        while(temp!=null){
            newNode=new Node(temp.val);
            hm.put(temp,newNode);
            temp=temp.next;
        }

        temp=head;
        Node newNodeDeep=null;

        while(temp!=null){
            newNodeDeep=hm.get(temp);
            newNodeDeep.next=hm.get(temp.next);
            newNodeDeep.random=hm.get(temp.random);
            if(headDeep==null){
                headDeep=newNodeDeep;
            }
            temp=temp.next;
        }

        return headDeep;
    }
    // Q9 Check linked list with a loop is palindrome or not
    public boolean isPalindromeCheck(Node head) {
        if (head == null || head.next == null) {
            return true; // Empty or single-node linked list is a palindrome.
        }
        // Step 1: Detect the loop (if it exists) and find the middle of the linked list.
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }
        // Step 2: Reverse the second half of the linked list.
        Node reversed = reverseLinkedList(slow);

        // Step 3: Compare the first half with the reversed second half.
        Node firstHalf = head;
        Node secondHalf = reversed;

        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false; // Not a palindrome.
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }
        // Step 4: Restore the original linked list (optional).
        return true; // Palindrome.
    }
    private Node reverseLinkedList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }
    //Q10 Convert Binary Number in a Linked List to Integer
    public int getDecimalValue(Node head) {
        String str="";
        Node temp=head;
        while(temp!=null){
            str+=temp.val;
            temp=temp.next;
        }
        return toDecimal(str);
    }
    public int toDecimal(String str) {
        int power=str.length()-1;
        int ans=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int digit = ch - '0';
            if(digit==1)
                ans+=(int)Math.pow(2,power)*digit;
            power--;
        }
        return ans;
    }
    //Q11 Add Two Numbers
    public Node addTwoNumbers(Node l1, Node l2) {
        Node resultHead = new Node();
        Node current = resultHead;

        Node temp1=l1;
        Node temp2=l2;
        int carry=0;
        while(temp1!=null||temp2!=null||carry!=0){
            int val1 = (temp1 != null) ? temp1.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;
            int sum=val1+val2+carry;
            int num=sum%10;
            carry=sum/10;
            System.out.println("Hi "+num+" "+carry+" "+val1+" "+val2);

            current.next = new Node(num);
            current = current.next;
            
            if(temp1!=null)
                temp1=temp1.next;
            if(temp2!=null)
                temp2=temp2.next;
        }
        
        return resultHead.next;
	}
    //Q12 Insert into a Sorted Circular Linked List
    public Node insert(Node head, int insertVal) {
		Node tail=head;
		Node temp=null;
		Node newNode=new Node(insertVal) ;

        while(tail.next!=head){
            tail=tail.next;
        }
        if(insertVal>tail.val){
            tail.next=newNode;
            newNode.next=head;
            tail=newNode;
        }
        else if(insertVal<head.val){
            newNode.next=head;
            tail.next=newNode;
            head=newNode;
        }
        else{
            temp=head.next;
            Node prev=head;
            while(temp!=null&&insertVal>temp.val){
                prev=temp;
                temp=temp.next;
            }
            prev.next=newNode;
            newNode.next=temp;
        }

        return head;
	}
    // Q13 Remove Duplicates from Sorted List II
    public Node deleteDuplicates(Node head) {
        if((head==null)||(head.next==null))
            return head;
        Node answerHead=null,answerTail=null;
        Node temp=head,i=head,j=head;
        while(temp!=null){
            int freq=0;
            if(i.val==j.val){
                while(j!=null&&i.val==j.val){
                    j=j.next;
                    freq++;
                }
                if(freq==1){
                    if(answerHead==null&&answerTail==null){
                        answerHead=temp;
                        answerTail=temp;

                    }
                    else{
                        answerTail.next=temp;
                        answerTail=temp;
                    }
                   
                }
            }
            i=j;
            temp=j;
        }
        if(answerTail!=null)
        answerTail.next=null;
        return answerHead;
    }
    //Q14 Swap Nodes in Pairs
    public Node swapPairs(Node head) {
        if(head==null||head.next==null)
            return head;
        Node nxt=head.next;
        Node forward=head.next.next;

        nxt.next=head;
        head.next=swapPairs(forward);
        head=nxt;
        return head;
	}
    //Q15 Reverse K



    public class Q1_Linked_List_Implementation{
        public static void main(String[] args) {
            LinkedList ll=new LinkedList();   
            ll.insert(10); 
            ll.insert(20); 
            ll.insert(30); 
            ll.insert(40); 
            ll.insert(50); 
            ll.insert(60); 
            // ll.insertAtPos(45, 7);
            ll.deleteElement(60);

            // ll.insert(10); 
            // ll.insert(10); 
            // ll.insert(10); 
            // ll.insert(30); 
            // ll.insert(10); 
            // ll.insert(10); 
            // ll.head=ll.removeElements(ll.head,10);

            // ll.insert(10); 
            // ll.insert(20); 
            // ll.insert(30); 
            // ll.insert(40); 
            // ll.insert(50); 
            // ll.insert(60); 
            // ll.head=ll.reverseList(ll.head);

            // ll.insert(10); 
            // ll.insert(20); 
            // ll.insert(30); 
            // ll.insert(30); 
            // ll.insert(20); 
            // ll.insert(10); 
            // System.out.println(ll.isPalindrome(ll.head));
            ll.display();
        }
        

    }

}

