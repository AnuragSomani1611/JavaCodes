package DSA_Sorting;

import java.util.Arrays;

public class bubble_sort {
    public static void main(String[] args) {
        int []arr = {5, 3, 2, 1, 8};
        int n = arr.length;
        int count = 0;
//        for(int i = 0; i < n; i++){
//            for(int j = i; j < n; j++){
//                if(arr[j] < arr[i]){
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                    count++;
//                }
//
//            }
//        }
//        System.out.println(count);
//        count = 0;
//        for(int i = 0; i < n-1; i++){
//            for(int j = 0; j < n-i-1; j++){
//                if(arr[j] > arr[j+1]){
//                    int temp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = temp;
//                }
//                count++;
//            }
//        }
        for(int i = 0; i < n-1; i++){
            boolean swapped = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
                count++;
            }
            System.out.println(count);
            System.out.println(Arrays.toString(arr));
            for(int k = n-1; k > i; k--){
                System.out.print("   ");
            }
            System.out.println(" ^ ");
            if(!swapped){
                break;
            }
        }
        System.out.println(count);
    }
}
