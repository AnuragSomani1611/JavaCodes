package DemoProgs;
public class Demo1 {
    public static int sumfind(int a){
        int sum1 = 0;
        while(a>0){
           sum1 += a%10;
           a = a/10;
        }
        return sum1;
    }
    public static void main(String[] args) {
        int n = 50;
        int m = 61;
        int sum = 0;
        for(int i = n; i<=m; i++){
            sum = sum + sumfind(i);
            System.out.println(sumfind(i));
            //
        }
        System.out.println(sum);
    }
}
