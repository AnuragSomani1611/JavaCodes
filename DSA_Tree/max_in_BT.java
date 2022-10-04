package DSA_Tree;

public class max_in_BT {
    public static int getMax(TreeNode root){
        if(root == null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.key, Math.max(getMax(root.left), getMax(root.right)));
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
        System.out.println(getMax(root));
    }
}
