package DSA_Tree;

import com.sun.source.tree.Tree;

public class children_sum_property {
    public static boolean checkSum(TreeNode root){
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            return true;
        }
        int sum = 0;
        if(root.left != null){
            sum+=root.left.key;
        }
        if(root.right != null){
            sum+= root.right.key;
        }
        return sum == root.key && checkSum(root.left) && checkSum(root.right);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(50);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(15);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);
        System.out.println(checkSum(root));
    }
}
