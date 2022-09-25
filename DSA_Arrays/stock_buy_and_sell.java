package DSA_Arrays;
public class stock_buy_and_sell {
    public static void main(String[] args) {
        int []arr =
        {1, 3, 1, 5, 8, 12, 1, 5, 3, 13};
        //{1, 5, 3, 1, 2, 8};
        //{10, 20, 30};
        //{30, 20, 10};
        int sum = 0;
        int buy = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < arr[i-1]){
                sum += (arr[i-1] - arr[buy]);
                buy = i;
            }
        }
        sum += arr[arr.length-1] - arr[buy];
        System.out.println(sum);
    }
}
