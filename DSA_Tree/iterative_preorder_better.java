package DSA_Tree;

import java.util.Stack;

public class iterative_preorder_better {
    public static void iterativePreorder(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode curr = root;
        while(!stack.isEmpty()){
            while (curr!=null){
                System.out.print(curr.key + " ");
                if(curr.right!=null){
                    stack.push(curr.right);
                }
                curr = curr.left;
            }
            if(!stack.isEmpty()){
                curr = stack.pop();
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
        iterativePreorder(root);
    }
}
