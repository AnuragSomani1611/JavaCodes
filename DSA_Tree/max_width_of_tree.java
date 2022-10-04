package DSA_Tree;

import java.util.ArrayDeque;

public class max_width_of_tree {
    public static void maxwidth(TreeNode root){
        if(root == null){
            return;
        }
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        q.offer(root);
        int res = 0;
        while (!q.isEmpty()){
            int size = q.size();
            res = Math.max(res, size);
            for(int i = 0; i < size; i++){
                TreeNode curr = q.poll();
                if(curr.left != null){
                    q.offer(curr.left);
                }
                if(curr.right!=null){
                    q.offer(curr.right);
                }
            }
        }
        System.out.println(res);
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
        maxwidth(root);
    }
}
