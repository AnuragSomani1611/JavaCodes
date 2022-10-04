package DSA_Tree;

public class lowest_common_ancestor {
    public static TreeNode findAncestor(TreeNode root, int n1, int n2){
        if(root == null){
            return null;
        }
        if(root.key == n1 || root.key == n2){
            return root;
        }
        TreeNode lca1 = findAncestor(root.left, n1, n2);
        TreeNode lca2 = findAncestor(root.right, n1, n2);
        if(lca1!=null & lca2!=null){
            return root;
        }
        if(lca1!=null){
            return lca1;
        }
        else
            return lca2;
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
        System.out.println(findAncestor(root, 90, 60).key);
    }
}
