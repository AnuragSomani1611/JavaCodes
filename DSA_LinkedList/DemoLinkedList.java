package DSA_LinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode random;
    ListNode(int x){
        this.val = x;
    }
}
public class DemoLinkedList {
    public static void traverse(ListNode head){
        while(head!=null){
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
//    public static ListNode clone(ListNode head){
//        ListNode curr = head;
//        head.next = curr;
//        for(curr = head; curr != null; curr = curr.next.next){
//            ListNode next = curr.next;
//
//        }
//    }
    public static void main(String[] args) {
        ListNode head = new ListNode(7);
        ListNode new1= new ListNode(13);
        ListNode new2 = new ListNode(11);
        ListNode new3 = new ListNode(10);
        ListNode new4 = new ListNode(1);
        ListNode new5 = null;
        head.random = new5;
        head.next = new1;
        new1.next = new2;
        new2.next = new3;
        new3.next = new4;
        new4.next = new5;
        new1.random = head;
        new2.random = new4;
        new3.random = new2;
        new4.random = head;
        traverse(head);
    }
}
