package DemoProgs;
public class demo {
    public static int minimumTime(int n, int []a, char []b){
        int Awork = Integer.MAX_VALUE;
        int Bwork = Integer.MAX_VALUE;
        int Cwork = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(b[i] == 'A'){
                Awork = Math.min(Awork, a[i]);
            }
            else if(b[i] == 'B'){
                Bwork = Math.min(Bwork, a[i]);
            }
            else if(b[i] == 'C'){
                Cwork = Math.min(Cwork, a[i]);
            }
        }
        return Math.min(Awork+Bwork, Cwork);
    }
    public static void main(String[] args) {
        int[] a = {2, 5, 2, 4, 3};
        char []b = {'A', 'B', 'A', 'C', 'B'};
        System.out.println(minimumTime(a.length, a, b));
    }

}
