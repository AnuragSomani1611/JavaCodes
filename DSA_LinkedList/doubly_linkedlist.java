package DSA_LinkedList;

class Nod{
    int data;
    Nod prev;
    Nod next;
    Nod(int x){
        data = x;
//        prev = null; automatically gets initialized
//        next = null;
    }

    @Override
    public String toString() {
        return data + " ";
    }
}
public class doubly_linkedlist {
    public static Nod insertFront(Nod head, int x){
        Nod temp = new Nod(x);
        if(head == null){
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        return temp;
    }
    public static Nod insertEnd(Nod head, int x){
        Nod temp = new Nod(x);
        if(head == null){
            return temp;
        }
        Nod curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        temp.prev = curr;
        return head;
    }
    public static Nod reverse(Nod head){
        Nod temp = head.next;
        Nod curr = head;
        if(head == null || head.next == null){
            return head;
        }
        while(curr!=null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        return temp.prev;
    }
    public static Nod dltHead(Nod head){
        if(head == null || head.next == null){
            return null;
        }
        head = head.next;
        head.prev = null;
        return head;
    }
    public static Nod dltLast(Nod head){
        if(head == null || head.next == null){
            return null;
        }
        Nod curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.prev.next = null;
        return head;
    }
    public static void main(String[] args) {
        Nod head = new Nod(10);
        Nod temp1 = new Nod(20);
        Nod temp2 = new Nod(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        System.out.println(reverse(head));
    }

}
