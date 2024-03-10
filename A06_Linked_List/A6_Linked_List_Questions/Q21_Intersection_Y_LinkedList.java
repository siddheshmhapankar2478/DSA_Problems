package A06_Linked_List.A6_Linked_List_Questions;

public class Q21_Intersection_Y_LinkedList {
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

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA=headA;
        ListNode tempB=headB;
        int countA=0,countB=0;
        while(tempA!=null){
            tempA=tempA.next;
            countA++;
        }
        while(tempB!=null){
            tempB=tempB.next;
            countB++;
        }
        int diff=Math.abs(countB-countA);
        tempA=headA;
        tempB=headB;
        if(countA>countB){
            while(diff>0){
                tempA=tempA.next;
                diff--;
            }
        }
        else{
            while(diff>0){
                tempB=tempB.next;
                diff--;
            }
        }
        while(tempA!=null&&tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null;
    }
}
