package DSA_Sorting;

import java.util.Arrays;

public class merge_sort {
    public static void merge(int []arr, int low, int mid, int high){
        int n = low;
        int m = mid+1;
        int []temp = new int[high-low+1];
        int i = 0;
        while(n <= mid && m <= high){
            if(arr[n] <= arr[m]){
                temp[i++] = arr[n++];
            }
            else
                temp[i++] = arr[m++];
        }
        while(n <= mid){
            temp[i++] = arr[n++];
        }
        while(m <= high){
            temp[i++] = arr[m++];
        }
        int j = 0;
        while(j < temp.length){
            arr[low++] = temp[j++];
        }
    }
    public static void mergeSort(int []arr, int low, int high){
        if(low >= high){
            return;
        }
        else{
            int mid = low + ((high-low)/2); //(low+high)/2; is not used to avoid overflow
            mergeSort(arr,low, mid);
            mergeSort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }
    public static void main(String[] args) {
        int []arr = {50, 60, 70, 80, 10, 40, 30};
        int n = arr.length-1;
        mergeSort(arr, 0, n);
        System.out.println(Arrays.toString(arr));
    }
}
