package listNode;

public class ReverseList {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode result = reverseList(listNode);
        System.out.println(result);
        System.out.println(listNode);

    }

    public static ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode before = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = before;
            before = cur;
            cur = next;
        }
        return before;
    }

}

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
