package A06_Linked_List.A6_Linked_List_Questions;

public class Q11_Add_2_Number {
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1,temp2=l2;
        ListNode ansHead=null,ansTail=null;
        int carry=0;
        while(temp1!=null||temp2!=null){
            int val1=temp1!=null?temp1.val:0;
            int val2=temp2!=null?temp2.val:0;
            int sum=val1+val2+carry;
            ListNode newNode=new ListNode(sum%10);
            carry=(sum>9)?1:0;
            if(ansHead==null&&ansTail==null){
                ansHead=newNode;
                ansTail=newNode;
            }
            else{
                ansTail.next=newNode;
                ansTail=newNode;
            }
            if(temp1!=null)
                temp1=temp1.next;
            if(temp2!=null)
                temp2=temp2.next;
        }
        if(carry==1){
            ListNode newNode=new ListNode(carry);
            ansTail.next=newNode;
        }
        return ansHead;
    }
}
