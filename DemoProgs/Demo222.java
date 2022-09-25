package DemoProgs;

public class Demo222 {
    public static void main(String[] args) {
        long[] a = {1,2,3,4,5};
        int n = a.length;
        int count = 0;
        long sum = 0;
        for(int i = 0; i < n; i++){
            if((a[i] != 0) && (a[i] & (a[i]-1)) == 0){
                sum += a[i];
                count++;
            }
        }
        System.out.println(sum);
    }
}
