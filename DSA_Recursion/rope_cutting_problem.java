package DSA_Recursion;

public class rope_cutting_problem {
    public static int countPieces(int n, int a, int b, int c){
        if(n == 0){
            return 0;
        } else if (n < 0) {
            return -1;
        }
        int res = Math.max(countPieces(n-a, a, b, c), countPieces(n-b, a, b, c));
        res = Math.max(res, countPieces(n-c, a, b, c));
        if(res == -1){
            return -1;
        }
        return res+1;
    }

    public static void main(String[] args) {
        System.out.println(countPieces(5, 2, 5, 1));
    }
}
