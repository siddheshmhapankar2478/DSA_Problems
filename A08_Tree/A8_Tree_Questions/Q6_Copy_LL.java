package A08_Tree.A8_Tree_Questions;

import java.util.HashMap;

public class Q6_Copy_LL {
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

    public Node copyRandomList(Node head) {
        HashMap<Node, Node> hm = new HashMap<>();
        Node temp = head;
        while (temp != null) {
            Node newNode = new Node(temp.val);
            hm.put(temp, newNode);
            temp = temp.next;
        }
        Node copyHead = hm.get(head);
        for (Node t : hm.keySet()) {
            Node copy = hm.get(t);
            copy.next = hm.get(t.next);
            copy.random = hm.get(t.random);
        }
        return copyHead;
    }
}