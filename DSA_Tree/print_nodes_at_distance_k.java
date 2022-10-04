package DSA_Tree;

import com.sun.source.tree.Tree;

public class print_nodes_at_distance_k {
    public static void getRootsOfKNodes(int k, TreeNode root){
        if(root == null){
            return;
        }
        if(k == 0){
            System.out.print(root.key + " ");
        }
        else{
            getRootsOfKNodes(k-1 , root.left);
            getRootsOfKNodes(k-1 ,root.right);
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
        int k = 2;
        getRootsOfKNodes(k, root);
    }
}
