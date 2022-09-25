package DSA_Sorting;
public class union_two_sorted {
    public static void main(String[] args) {
        int a[] = {2,3,3,4,5,6};
        int b[] = {2,4,4,5,7,8};
        int n = a.length, m = b.length;
        int i = 0, j = 0;
        while(i < n && j < m){
            if(i > 0 && a[i] == a[i-1]){
                i++;
                continue;
            }
            if(j > 0 && b[j] == b[j-1]){
                j++;
                continue;
            }
            if(a[i] == b[j]){
                System.out.println(a[i]);
                i++;
                j++;
            }
            else if(a[i] < b[j]){
                System.out.println(a[i]);
                i++;
            }
            else{
                System.out.println(b[j]);
                j++;
            }
        }
        while(i < n){
            if(i > 0 && a[i] != a[i-1]){
                System.out.println(a[i]);
            }
            i++;
        }
        while(j < m){
            if(j > 0 && b[j] != b[j-1]){
                System.out.println(b[j]);
            }
            j++;
        }
    }
}
