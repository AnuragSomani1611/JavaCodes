package DSA_Tree;

public class check_balanced_tree {
    public static int checkBalance(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = checkBalance(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = checkBalance(root.right);
        if(rh == -1){
            return -1;
        }
        if(Math.abs(lh-rh) > 1){
            return -1;
        }
        else
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
        root.right.right = new TreeNode(50);
        root.right.left = new TreeNode(40);
        root.right.left.right = new TreeNode(15);
        //root.right.left.right.right = new TreeNode(15);
        if (checkBalance(root) >= 0){
            System.out.println("balanced");
        }
        else{
            System.out.println("Not balanced");
        }
    }
}
