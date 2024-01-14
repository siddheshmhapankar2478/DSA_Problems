package A06_Linked_List.A6_Linked_List_Questions;

public class Q17_Rotate_LL {
    public static void main(String[] args) {

    }

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

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode temp = head, last = head, header = null;
        int count = 0;

        while (last.next != null) {
            last = last.next;
            count++;
        }
        count++;
        if (k % count == 0)
            return head;
        int startpont = count - (k % count);
        while (startpont > 1) {
            temp = temp.next;
            startpont--;
        }
        header = temp.next;
        temp.next = null;
        last.next = head;
        return header;
    }
}
