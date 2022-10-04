package DSA_Tree;

import java.util.ArrayDeque;

public class print_left_view_of_BT {
    static int maxlevel = 0;
    public static void printleft(TreeNode root, int level){
        if(root == null){
            return;
        }
        if(maxlevel < level){
            System.out.print(root.key + " ");
            maxlevel = level;
        }
        printleft(root.left, level+1);
        printleft(root.right, level+1);
    }
    public static void leftView(TreeNode root){
        if(root == null){
            return;
        }
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        while (!q.isEmpty()){
            int count = q.size();
            for(int i = 0; i < count; i++){
                TreeNode curr = q.poll();
                if(i == 0){
                    System.out.print(curr.key + " ");
                }
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
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
        //leftView(root);
        printleft(root, 1);
        System.out.println();
        leftView(root);
    }
}
