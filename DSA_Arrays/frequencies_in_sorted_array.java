package DSA_Arrays;
public class frequencies_in_sorted_array {
    public static void main(String[] args) {
        int[] arr =
        //{10, 10, 10, 25, 30, 30};
        //{10, 10, 10};
        //{10, 20, 30};
        {10, 20, 20, 45, 45, 50, 50, 50, 70, 70, 70, 70, 75};
        int count = 1;
        int res = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[res] != arr[i]){
                System.out.println(arr[res] + " " + count);
                count = 1;
                res = i;
            }
            else{
                count++;
            }
        }
        System.out.println(arr[res] + " " + count);
    }
}
