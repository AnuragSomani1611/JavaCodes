package DSA_Mathematics;

public class ComputerPowerIterative {
    public static int power(int x, int n){
        int res = 1;
        // logn approach
        while(n > 0){
            if(n%2 != 0){
                res = res * x;
            }
            x = x * x;
            n = n/2;
        }
        return res;
    }

    public static void main(String[] args) {
        int x = 4;
        int n = 5;
        System.out.println(power(x, n));
//        String s = "";
//        while(n > 0){
//            if(n%2 == 0){
//                s = s + "1";
//            }
//            else
//                s = s + "0";
//            n = n/2;
//        }
//        System.out.println(s);
//        int sum = 0;
//        int n1 = 1;
//        for(int i = 0; i < s.length(); i++){
//            if(s.charAt(i) == '1'){
//                sum = sum + power(n1);
//                n1 = n1 * 2;
//            }
//        }
    }
}
