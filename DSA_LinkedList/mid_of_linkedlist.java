package DSA_LinkedList;

import static DSA_LinkedList.find_nth_node.findNthNode;

class Nodee{
    int data;
    Nodee next;
    Nodee(int x){
        data = x;
        next = null;
    }
}
class mid_of_linkedlist {
    public static void findMiddle(Nodee head){
        if(head == null){
            return;
        }
        Nodee slow = head, fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data);
    }

    public static void main(String[] args) {
        Nodee head = new Nodee(10);
        head.next = new Nodee(20);
        head.next.next = new Nodee(15);
        head.next.next.next = new Nodee(30);
        find_nth_node findNthNode = new find_nth_node();
        findNthNode(head, 1);
    }
}
class find_nth_node{
    public static void findNthNode(Nodee head, int n){
        if(head == null){
            return;
        }
        Nodee first = head;
        Nodee second = head;
        int i = 0;
        while(i < n){
            if (second == null){
                return;
            }
            second = second.next;
            i++;
        }
        while(second!=null){
            first = first.next;
            second = second.next;
        }
        System.out.println(first.data);
    }
}
