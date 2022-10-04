package DSA_Tree;

import java.util.ArrayDeque;

public class tree_traversal_in_spiral_form {
    public static void spiralTreeTraversalMethod2(TreeNode root){
        if(root == null){
            return;
        }
        ArrayDeque<TreeNode> stack1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> stack2 = new ArrayDeque<>();
        stack1.push(root);
        while(!stack1.isEmpty() || !stack2.isEmpty()){
            while(!stack1.isEmpty()){
                System.out.print(stack1.peek().key + " ");
                if(stack1.peek().left!=null){
                    stack2.push(stack1.peek().left);
                }
                if(stack1.peek().right!=null){
                    stack2.push(stack1.peek().right);
                }
                stack1.pop();
            }
            System.out.println();
            while(!stack2.isEmpty()){
                System.out.print(stack2.peek().key + " ");
                if(stack2.peek().right != null){
                    stack1.push(stack2.peek().right);
                }
                if(stack2.peek().left != null){
                    stack1.push(stack2.peek().left);
                }
                stack2.pop();
            }
            System.out.println();
        }
    }
    public static void spiralTreeTraversal(TreeNode root){
        if(root == null){
            return;
        }
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        boolean reverse = false;
        q.offer(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if(reverse){
                    stack.push(curr.key);
                }
                else{
                    System.out.print(curr.key + " ");
                }
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right != null){
                    q.offer(curr.right);
                }
            }
            if(reverse){
                while(!stack.isEmpty()){
                    System.out.print(stack.pop() + " ");
                }
            }
            reverse = !reverse;
            System.out.println();
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
        spiralTreeTraversalMethod2(root);
        spiralTreeTraversal(root);
    }
}