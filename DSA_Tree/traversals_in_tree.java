package DSA_Tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class TreeNode{
    int key;
    TreeNode left, right;
    TreeNode(int key){
        this.key = key;
    }
}
public class traversals_in_tree {
    public static int count = 0;
    public static int size = 0;
    public static int height(TreeNode root){
        if(root == null){
            return 0;
        }
        else return Math.max(height(root.left), height(root.right))+1;
    }
    public static void levelOrder(TreeNode root){
        if(root==null){
            return;
        }
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            System.out.print(temp.key + " ");
            if(temp.left!=null){
                q.offer(temp.left);
            }
            if(temp.right!=null){
                q.offer(temp.right);
            }
        }
    }
    public static void levelOrderLineByLine(TreeNode root){
//        if(root == null){
//            return;
//        }
//        ArrayDeque<TreeNode> q = new ArrayDeque<>();
//        q.add(root);
//        q.add(null);
//        while(q.size()>1){
//            TreeNode temp = q.remove();
//            if(temp == null){
//                System.out.println();
//                q.add(null);
//                continue;
//            }
//            System.out.println(temp.key);
//            if(temp.left!=null){
//                q.add(temp.left);
//            }
//            if(temp.right!=null){
//                q.add(temp.right);
//            }
//        }
        if (root == null)
            return;

        // Create an empty queue for level order traversal
        Queue<TreeNode> q = new LinkedList<>();

        // Enqueue Root and initialize height
        q.add(root);
        while (true) {
            // nodeCount (queue size) indicates number of
            // nodes at current level.
            int nodeCount = q.size();
            if (nodeCount == 0)
                break;
            // Dequeue all nodes of current level and
            // Enqueue all nodes of next level
            while (nodeCount > 0) {
                TreeNode node = q.peek();
                System.out.print(node.key + " ");
                q.remove();
                if (node.left != null)
                    q.add(node.left);
                if (node.right != null)
                    q.add(node.right);
                nodeCount--;
            }
            System.out.println();
        }
        //can be done using for loop
    }
    public static void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
            count++;
        }
    }
    public static void preorder(TreeNode root){
        if(root!=null){
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }
    public static void postorder(TreeNode root){
        if(root!=null){
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key + " ");
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
//        root.right.right.right = new TreeNode(600);
//        root.right.right.right.right = new TreeNode(100);
//        root.right.right.right.right.right = new TreeNode(200);
//        root.right.right.right.right.right.right = new TreeNode(300);
//        root.right.right.right.right.right.right.right = new TreeNode(400);
        inorder(root);
        System.out.println();
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println("\n"+height(root));
        levelOrder(root);
        System.out.println();
        levelOrderLineByLine(root);
    }
}
