package DSA_Sorting;
import java.util.Arrays;

public class selection_sort {
    public static void swap(int arr[],int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void main(String[] args) {
        int []arr = {5, 3, 2, 1, 8};
        int n = arr.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
                count++;
            }
            swap(arr, min, i);
            System.out.println(count);
            System.out.println(Arrays.toString(arr));
            for(int k = 0; k < i; k++){
                System.out.print("   ");
            }
            System.out.println(" ^ ");
        }
        System.out.println(count);
    }
}
