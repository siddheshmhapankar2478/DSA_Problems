package A06_Linked_List.A6_Linked_List_Questions;

public class Q20_Remove_nth_Last_Node {
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head,slow=head;
        while(n>0){
            fast=fast.next;
            n--;
        }
        if(fast==null)
            return slow.next;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        if(slow!=null&&slow.next!=null)
            slow.next=slow.next.next;
        return head;
    }
}
