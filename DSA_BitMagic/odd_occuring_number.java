package DSA_BitMagic;

public class odd_occuring_number {
    public static void main(String[] args) {
        int []arr = {3, 3, 3, 4, 4, 5, 5, 6, 6};
        int res = 0;
        //int temp = 1;
        for(int i = 0; i < arr.length; i++){
            //temp = res;
            res = res ^ arr[i];
//            if(temp != res && res != 0){
//                System.out.println(res/temp);
//            }
        }
        System.out.println(res);
    }
}
