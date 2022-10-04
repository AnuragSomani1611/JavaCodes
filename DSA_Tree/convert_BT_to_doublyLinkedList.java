package DSA_Tree;
public class convert_BT_to_doublyLinkedList {
    static TreeNode prev = null;
    public static TreeNode convertFunc(TreeNode root){
        if(root==null){
            return root;
        }
        TreeNode head = convertFunc(root.left);
        if(prev == null){
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;
        }
        prev = root;
        convertFunc(root.right);
        return head;
    }
    public static void traverse(TreeNode head){
        if(head == null){
            return;
        }
        while(head != null){
            System.out.print(head.key + " ");
            head = head.right;
        }
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(60);
        root.left.right = new TreeNode(70);
        root.left.right.left = new TreeNode(80);
        root.left.right.right = new TreeNode(90);
        root.right.right = new TreeNode(50);
        root.right.left = new TreeNode(40);
        TreeNode head = convertFunc(root);
        traverse(head);
    }
}
