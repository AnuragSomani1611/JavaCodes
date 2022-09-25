package DSA_Sorting;

public class count_inversions {
    public static int countAndMerge(int arr[], int l, int m, int r){
        int res = 0;
        return res;
    }
    public static int countInv(int arr[], int l, int r){
        int res = 0;
        if(l < r){
            int m = l + (r-l)/2;
            res += countInv(arr, l, m);
            res += countInv(arr, m+1, r);
            res += countAndMerge(arr, l, m, r);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {4,9,5,3,2,10};
        int n = arr.length;
        System.out.println(countInv(arr,0,n-1));
    }
}
