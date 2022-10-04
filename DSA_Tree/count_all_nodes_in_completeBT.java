package DSA_Tree;

public class count_all_nodes_in_completeBT {
    //this is naive mehtod used for all types of BT
    public static int countNodes(TreeNode root){
        if(root == null){
            return 0;
        }
        int lh = countNodes(root.left);
        int rh = countNodes(root.right);
        return lh+rh+1;
    }
    public static int countNodesInCompleteBT(TreeNode root){
        int lh = 0, rh = 0;
        TreeNode curr = root;
        while(curr!=null){
            lh++;
            curr = curr.left;
        }
        curr = root;
        while(curr!=null){
            rh++;
            curr = curr.right;
        }
        if(lh == rh){
            return (int)Math.pow(2, lh)-1;
        }
        return 1+countNodesInCompleteBT(root.left)+countNodesInCompleteBT((root.right));
    }
    public static void main(String[] args) {
//        TreeNode root = new TreeNode(10);
//        root.left = new TreeNode(20);
//        root.right = new TreeNode(30);
//        root.left.left = new TreeNode(60);
//        root.left.right = new TreeNode(70);
//        root.left.right.left = new TreeNode(80);
//        root.left.right.right = new TreeNode(90);
//        root.right.right = new TreeNode(50);
//        root.right.left = new TreeNode(40);
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.right.left = new TreeNode(40);
        root.right.right = new TreeNode(50);
        System.out.println(countNodesInCompleteBT(root));
    }
}
