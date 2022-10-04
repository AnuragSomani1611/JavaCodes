package DSA_Stack;

import java.util.ArrayDeque;
import java.util.Arrays;

public class largest_rectangular_area {
    public static void main(String[] args) {
        int arr[] = {6, 2, 5, 4, 1, 5, 6};
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int res = 0;
        int curr = 1;
        int tp;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                tp = stack.pop();
                curr = arr[tp] * (stack.isEmpty() ? i : i-stack.peek()-1);
                res = Math.max(curr,res);
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            tp = stack.pop();
            curr = arr[tp] * (stack.isEmpty() ? n : n-stack.peek()-1);
            res = Math.max(curr,res);
        }
        System.out.println(res);
        int mat[][] = {
                {1,0,0,1,1},
                {0,0,0,1,1},
                {1,1,1,1,1},
                {0,1,1,1,1}
        };
        for(int i = 1; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    mat[i][j] += mat[i-1][j];
                }
            }
        }

//        for(int []i: mat){
//            System.out.println(Arrays.toString(i));
//        }

        int r = 0;
        int c = 1;
        int e = mat.length-1;
        int []arr1 = Arrays.copyOf(mat[e], mat[e].length);
        n = arr1.length;
        System.out.println(Arrays.toString(arr1));
        stack.clear();
        for(int i = 0; i < arr1.length; i++){
//            System.out.println(stack);
            while(!stack.isEmpty() && arr1[stack.peek()] > arr1[i]){
                int top = stack.pop();
                c = arr1[top] * (stack.isEmpty() ? i:(i-stack.peek()-1));
                r = Math.max(r,c);
            }
//            System.out.println(stack);
            stack.push(i);
//            System.out.println(stack);
        }
//        System.out.println(stack);
        while(!stack.isEmpty()){
            int top = stack.pop();
            c = arr1[top] * (stack.isEmpty() ? n:(n-stack.peek()-1));
            r = Math.max(c,r);
        }
        System.out.println(r);
    }
}
