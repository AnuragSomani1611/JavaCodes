package DSA_Tree;

public class diameter_of_binary_tree {
    static int res = 0;
    //naive using max heigh function again and again
    //can be done in O(n) using hashmap
    public static int diameter(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = diameter(root.left);
        int rh = diameter(root.right);
        res = Math.max(res, lh+rh);
        System.out.println(root.key + "-> lh:" + lh + " rh:" + rh + " res:" + res);
        return Math.max(lh,rh)+1;
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(60);
        root.left.right = new TreeNode(70);
        root.left.right.left = new TreeNode(80);
        root.left.right.right = new TreeNode(90);
        root.left.right.right.left = new TreeNode(100);
        root.left.right.right.left.left = new TreeNode(100);
        root.right.right = new TreeNode(50);
        root.right.left = new TreeNode(40);
        diameter(root);
        System.out.println(res);
    }
}
