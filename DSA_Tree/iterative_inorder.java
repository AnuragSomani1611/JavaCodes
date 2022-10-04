package DSA_Tree;

import java.util.Stack;

public class iterative_inorder {
    public static void iterativeInorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            System.out.print(curr.key + " ");
            curr = curr.right;
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
        iterativeInorder(root);
    }
}
