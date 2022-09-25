package DSA_Sorting;
public class find_intersection_two_sorted_array {
    public static void for_unsorted_arr(int []a, int []b, int n, int m){
        int i = 0;
        int j = 0;
        while(a[i] != b[j]){
            i = i==n-1 ? 0 : i+1;
            j = j==m-1 ? 0 : j+1;
            System.out.println(i + " " + j);
            if(a[i] == b[j]){
                System.out.println(a[i] + " " + b[j]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {5, 15, 20, 30, 60};
        int b[] = {2, 10, 30, 60};
        int n = a.length;
        int m = b.length;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(i>0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(a[i] < b[j]){
                i++;
            }
            else if(a[i] > b[j]){
                j++;
            }
            else{
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
        for_unsorted_arr(a,b,n,m);
    }
}
