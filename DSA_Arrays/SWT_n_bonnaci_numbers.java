package DSA_Arrays;

public class SWT_n_bonnaci_numbers {
    public static void main(String[] args) {
        int n = 5;
        int m = 20;
        int arr[] = new int[n];
        for(int i = 0; i < n-1; i++){
            arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
        arr[n-1] = 1;
        int sum = 1;
        System.out.print(arr[n-1]+ " ");
        for(int i = n; i < m; i++){
            int j = i%n;
            int temp = arr[j];
            arr[j] = sum;
            System.out.print(arr[j]+ " ");
            sum = sum + arr[j] - temp;
        }
    }
}
