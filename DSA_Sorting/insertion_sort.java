package DSA_Sorting;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int []arr = {5, 3, 2, 1, 8};
        int n = arr.length;
        int count = 0;
        for(int i = 1; i < n; i++){
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j]>key){// = use nahi karna h because it will make the sort unstable
                arr[j+1] = arr[j];
                j--;
                count++;
            }
            arr[j+1] = key;
            count++;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(count);
    }
}
