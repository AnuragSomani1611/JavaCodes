package DSA_LinkedList;
class Node{
    int data;
    Node next;
    Node(int x){
        data = x;
        next = null;
    }
}
public class singly_linkedlist {
    public static void traverse(Node head){
        if(head == null){
            System.out.print(head + " ");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }
    public static Node insertBegin(Node head, int x){
        Node temp = new Node(x);
        temp.next = head;
        return head;
    }
    public static Node insertEnd(Node head, int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = temp;
        return head;
    }
    public static Node dltFront(Node head){
        if(head == null){
            return null;
        }
        return head.next;
    }
    public static Node dltLast(Node head){
        if(head.next == null || head == null){
            return null;
        }
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        curr.next = null;
        return head;
    }
    public static Node insertAtPosition(Node head, int x, int k){
        Node temp = new Node(x);
        if(k == 1){
            temp.next = head;
            return temp;
        }
        Node curr  = head;
        for(int i = 1; i <= k-2 && curr!=null; i++){
            curr = curr.next;
        }
        if(curr == null){
            return head;
        }
        temp.next = curr.next;
        curr.next = temp;
        return head;
    }
    public static int search(Node head, int x){
        int pos = 1;
        Node curr = head;
        while(curr != null){
            if(curr.data == x){
                return pos;
            }
            else{
                pos++;
                curr = curr.next;
            }
        }
        return -1;
    }
    public static int searchIterative(Node head, int x){
        if(head == null){
            return -1;
        }
        if(head.data == x){
            return 1;
        }
        else{
            int res = searchIterative(head.next, x);
            if(res == -1){
                return -1;
            }
            else{
                return res+1;
            }
        }
    }
    public static Node recursiveReverse(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node rest_head = recursiveReverse(head.next);
        Node rest_tail = head.next;
        rest_tail.next = head;
        head.next = null;
        return rest_head;
    }
    public static Node recursiveReverseM2(Node curr, Node prev){
        if(curr == null){
            return prev;
        }
        Node next = curr.next;
        curr.next = prev;
        return recursiveReverseM2(next,curr);
    }
    public static void removeDupliFromSorted(Node head){
            Node curr = head;
            while(curr!=null && curr.next!=null){
                if(curr.data == curr.next.data){
                    curr.next = curr.next.next;
                }
                else
                    curr = curr.next;
            }
    }
    public static Node recursiveReverseInGroup(Node head, int k){
        Node curr = head;
        Node prev = null;
        Node next = null;
        int count = 0;
        while(count < k && curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(next != null){
            Node rest_head = recursiveReverseInGroup(next, k);
            head.next = rest_head;
        }
        return prev;
    }
    public static Node iterReverseInGroup(Node head, int k){
        Node curr = head, prevpass = null;
        boolean isFirstpass = true;
        while(curr != null){
            Node first = curr, prev = null;
            int count = 0;
            while(curr != null && count < k){
                Node next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
                count ++;
            }
            if(isFirstpass){
                head = prev;
                isFirstpass = false;
            }
            else{
                prevpass.next = prev;
            }
            prevpass = first;
        }
        return head;
    }
    public static void dltNthFromEnd(Node head, int n){
        if(head == null){
            return;
        }
        Node first = head;
        for(int i = 0; i < n; i++){
            if(first == null){
                return;
            }
            first = first.next;
        }
        Node second = head;
        while(first != null){
            second = second.next;
            first = first.next;
        }
        System.out.println(second.data);
    }
    public static void dltNodewithPointerOnIt(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
    }
    public static Node segregateEvenOddNodes(Node head){
        Node ed = null, os = null, curr = head, es = null, od = null;
        for(curr = head; curr != null; curr=curr.next){
            if(curr.data%2 == 0){
                if(es == null){
                    es = curr;
                    ed = es;
                }
                else{
                    ed.next = curr;
                    ed = ed.next;
                }
            }
            else{
                if(os == null){
                    os = curr;
                    od = os;
                }
                else{
                    od.next = curr;
                    od = od.next;
                }
            }
        }
        if(os == null || es == null){
            return head;
        }
        ed.next = os;
        od.next = null;
        return es;
    }
    public static Node intersectionOfTwoList(Node l1, Node l2){
        Node one = l1, two = l2;
        int c1 = 0, c2 = 0;
        while(one != null || two != null){
            if(one != null){
                c1 += 1;
                one = one.next;
            }
            if(two != null){
                c2 += 1;
                two = two.next;
            }
        }
        int abs = Math.abs(c1 - c2);
        for(int i = 0; i < abs; i++){
            if(c1 < c2){
                l1 = l1.next;
            }
            else{
                l2 = l2.next;
            }
        }
        while(l1 != null){
            if(l1 == l2){
                return l1;
            }
        }
        return null;
    }
    public static Node pairWiseSwap(Node head){
        if(head == null || head.next == null){
            return head;
        }
        Node prev = head;
        Node curr = head.next.next;
        head = head.next;
        head.next = prev;
        while(curr != null && curr.next != null){
            prev.next = curr.next;
            prev = curr;
            Node next = curr.next.next;
            curr.next.next = curr;
            curr = next;
        }
        prev.next = curr;
        return head;
    }
    public static Node mergeTwoSortedLL(Node headA, Node headB){
        if(headA == null || headB == null){
            return headA == null ? headB : headA;
        }
        Node a = headA;
        Node b = headB;

        Node head = a.data > b.data ? b : a;
        if(head == a){
            a = a.next;
        }
        else
            b = b.next;
        Node tail = head;
        while(a != null && b != null){
            if(a.data < b.data){
                tail.next = a;
                tail = tail.next;
                a = a.next;
            }
            else{
                tail.next = b;
                tail = tail.next;
                b = b.next;
            }
        }
        if(a == null){
            tail.next = b;
        }
        else
            tail.next = a;
        return head;
    }
    public static void main(String[] args) {
//        Node head = null;
//        head = insertBegin(head, 30);
//        head = insertBegin(head, 20);
//        head = insertBegin(head, 10);
//        head = insertEnd(head, 40);
//        head = dltFront(head);
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        Node head1 = new Node(5);
        head1.next = new Node(15);
        head1.next.next = new Node(35);
        head1.next.next.next = null;
//        head.next.next.next.next = null;
//        head = recursiveReverseInGroup(head, 2);
//        traverse(head);
//        System.out.println();
//        head = iterReverseInGroup(head, 2);
        traverse(head1);
        System.out.println();
        traverse(head);
        System.out.println();
        Node head2 = mergeTwoSortedLL(head, head1);
        traverse(head2);
    }
}
