package DSA_Strings;

import java.util.Arrays;

public class leftmost_repeating_char {
    public static void main(String[] args) {
        String a = "anuragsomani";
        int res = Integer.MAX_VALUE;
        int ch = 256;
        boolean arr[] = new boolean[ch];
        Arrays.fill(arr, false);
//        for(int i = 0; i < a.length(); i++){
//            int fi = arr[a.charAt(i)];
//            if(fi == -1){
//                arr[a.charAt(i)] = i;
//            }
//            else{
//                res = Math.min(res, fi);
//            }
//        }
//        res = res==Integer.MAX_VALUE ? -1:res;
        for(int i = a.length() - 1; i >= 0; i--){
            if(arr[a.charAt(i)]){
                res = i;
            }
            else{
                arr[a.charAt(i)] = true;
            }
        }
        System.out.println(res);
        //leftmost non repeating character
        Arrays.fill(arr, false);
        for(int i = a.length()-1; i >=0; i--){
            if(!arr[a.charAt(i)]) {
                res = i;
            }
            arr[a.charAt(i)] = true;
        }
        System.out.println(res);
    }
}
