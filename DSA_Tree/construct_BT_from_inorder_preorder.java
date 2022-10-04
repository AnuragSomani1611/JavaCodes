package DSA_Tree;

public class construct_BT_from_inorder_preorder {
    static int preIndex = 0;
    public static TreeNode constructBT(int[] inorder, int[] preorder, int start, int end){
        if(start > end){
            return null;
        }
        TreeNode root = new TreeNode(preorder[preIndex++]);
        int inIndex = 0;
        //this part can be done using a hashmap reducing the time complexity
        //preprocess the array and put the keys into hashmap
        for(int i = start; i <= end; i++){
            if(inorder[i] == root.key){
                inIndex = i;
                break;
            }
        }
        root.left = constructBT(inorder, preorder, start, inIndex-1);
        root.right = constructBT(inorder, preorder, inIndex+1, end);
        return root;
    }
    public static void inorder(TreeNode root){
        if(root != null){
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        int[] inorder = {20, 10, 40, 30, 50};
        int[] preorder = {10, 20, 30, 40, 50};
        int start = 0;
        int end = inorder.length-1;
        TreeNode root = constructBT(inorder, preorder, start, end);
        System.out.println(root.key);
        inorder(root);
    }
}
