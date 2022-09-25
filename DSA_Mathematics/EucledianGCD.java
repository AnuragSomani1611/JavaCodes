package DSA_Mathematics;

public class EucledianGCD {
    public static void main(String[] args) {
        int a = 13, b = 39;
        while(a != b){
            if(a > b){
                a = a - b;
            }
            else
                b = b - a;
        }
        System.out.println(a);
    }
}
