package DSA_LinkedList;

import java.util.HashSet;

public class circular_singly_linkedlist {
    public static void traverse(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        for(Node r = head.next; r != head; r = r.next){
            System.out.println(r.data);
        }
    }
    public static Node insertFront(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
        }
        else{
            Node curr = head;
            while(curr.next != head){
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = head;
        }
        return temp;
        //we can also do this by making temp as head and putting new data onto head
    }
    public static Node insertEnd(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            temp.next = temp;
            return temp;
        }
        int temp2 = head.data;
        temp.next = head.next;
        head.data = temp.data;
        temp.data = temp2;
        head.next = temp;
        return temp;
    }
    public static Node deleteHead(Node head){
        if(head == null || head.next == null){
            return null;
        }
        head.data = head.next.data;
        head.next = head.next.next;
        return head;
    }
    public static Node deleteKthNode(Node head, int pos){
        if(head == null || head.next == null){
            return null;
        }
        if(head.next != null && pos == 1){
            head.data = head.next.data;
            head.next = head.next.next;
            return head;
        }
        Node curr = head;
        int i = 1;
        while (i != pos-1) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }
    public static boolean detectLoop(Node head){
        //traverse 2 times through the loop and if curr = loopcurr then return true
        //modify the Node class and add one more variable to the Nodes i.e. visited and every time we visit the node we mark the visited as 1
        //create a temp node and direct all the nodes to it
        // ...modify the nxt of every node by putting its next as temporary node, now if any upcoming node's next is already temp then return true
        HashSet<Node> nodes = new HashSet<>();
        while(head!=null){
            if(nodes.contains(head)){
                return true;
            }
            else{
                nodes.add(head);
                head = head.next;
            }
        }
        return false;
    }
    public static void detectLoopFloydCycleandRemoveLoop(Node head){
        // this is the fast and slow pointer approach
        Node slow = head, fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
        }
        if(slow != fast){
            return;
        }
        slow = head;
        while(slow.next != fast.next){
            slow = slow.next;
            fast = fast.next;
        }
        fast.next = null;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(30);
        head.next.next.next.next = head;
//        head = insertEnd(head,40);
//        traverse(head);
//        head = deleteKthNode(head, 1);
//        System.out.println();
//        traverse(head);
        System.out.println(detectLoop(head));
        detectLoopFloydCycleandRemoveLoop(head);
    }
}
