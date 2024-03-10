package A06_Linked_List.A6_Linked_List_Questions;

public class Q18_Delete_Middle_of_LL {
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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null||head.next==null)
            return null;
        ListNode fast=head,slow=head,prev=null;
        while(fast!=null&&fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        prev.next=slow.next;
        return head;
    }
}
