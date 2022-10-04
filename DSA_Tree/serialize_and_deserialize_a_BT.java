package DSA_Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class serialize_and_deserialize_a_BT {
    public static ArrayList<Integer> list = new ArrayList<>();
    public static void serializeBT(TreeNode root){
        if(root == null){
            list.add(-1);
            return;
        }
        list.add(root.key);
        serializeBT(root.left);
        serializeBT(root.right);
    }
    static int index = 0;
    public static TreeNode deserializeBT(ArrayList<Integer> list){
        if(index == list.size()){
            return null;
        }
        int val = list.get(index);
        index++;
        if(val == -1){
            return null;
        }
        TreeNode root = new TreeNode(val);
        root.left = deserializeBT(list);
        root.right = deserializeBT(list);
        return root;
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
        root.left.left = new TreeNode(30);
        root.left.left.right = new TreeNode(40);
        serializeBT(root);
        System.out.println(list);
        Integer []arr = {10, 20, 60, -1, -1, 70, 80, -1, -1, 90, -1, -1, 30, 40, -1, -1, 50, -1, -1};
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(arr));
        TreeNode root1 = deserializeBT(list1);
        list.clear();
        serializeBT(root1);
        System.out.println(list);
    }
}
