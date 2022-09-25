package DSA_Arrays;

import java.util.Arrays;

public class count_inversions {
    public static void merge(int []arr, int[] temp, int low, int mid, int high){
        int i = low, j = mid, k = low;
        while(i <= mid-1 && j <= high){
            if(arr[i] <= arr[j]){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }
        //System.out.println(Arrays.toString(temp));
        while(i <= mid-1){
            temp[k++] = arr[i++];
        }
        while(j <= high){
            temp[k++] = arr[j++];
        }
        //System.out.println(Arrays.toString(temp));
        for(i = low; i <= high; i++){
            arr[i] = temp[i];
        }
    }
    public static void mergesort(int arr[], int[] temp, int low, int high){
        int mid;
        if(low < high){
            mid = low +( (high - low)/2);
            mergesort(arr, temp, low, mid);
            mergesort(arr, temp, mid+1, high);
            merge(arr, temp, low, mid+1, high);
        }
    }
    public static void main(String[] args) {
        int []arr = {6, 1, 4, 2, 3, 5};
        int[] temp = new int[arr.length];
        mergesort(arr, temp, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
