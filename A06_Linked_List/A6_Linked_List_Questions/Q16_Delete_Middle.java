package A06_Linked_List.A6_Linked_List_Questions;

public class Q16_Delete_Middle {
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
        if (head == null || head.next == null)
            return null;
        ListNode slow = head, fast = head, prev = null;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            if (fast.next != null)
                fast = fast.next.next;
        }
        if (prev != null && slow != null)
            prev.next = slow.next;
        return head;
    }
}
