package DSA_LinkedList;

public class circular_doubly_linkedlist {
    //insert at head
    public static void main(String[] args) {
        Nod head = new Nod(10);
        Nod temp1 = new Nod(20);
        Nod temp2 = new Nod(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head.prev = temp2;
        temp2.next = head;
    }
}
