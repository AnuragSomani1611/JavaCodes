package DSA_MultiDMatrix;

public class search_in_sorted_2D_matrix {
    public static void main(String[] args) {
        int arr[][] = {
                {10,20,30,40},
                {15,25,35,45},
                {19,29,39,49},
                {21,31,41,51}
        };
        int target = 11;
        int n = arr.length, m = arr[0].length;
        int i = 0, j = m-1;
        while(i < n && j >= 0){
            if(target == arr[i][j]){
                System.out.println(i + " " + j);
                break;
            }
            else if(target > arr[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
    }
}
