package A06_Linked_List.A6_Linked_List_Questions;

public class Q22_Remove_Linked_List_Element {
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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ansHead=null,ansTail=null;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val!=val){
                if(ansHead==null&&ansTail==null){
                    ansHead=temp;
                    ansTail=temp;
                }
                else{
                    ansTail.next=temp;
                    ansTail=temp;
                }
            }
            temp=temp.next;
        }
        if(ansTail!=null)
            ansTail.next=null;
        return ansHead;
    }
}