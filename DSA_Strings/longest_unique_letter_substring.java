package DSA_Strings;

import java.util.Arrays;

public class longest_unique_letter_substring {
    public static void main(String[] args) {
        String s = "anuragaomani";
        String s1 = "sarg";
        int arr[] = new int[26];
        Arrays.fill(arr, -1);
        int res = -1;
        for(int i = 0; i < s.length(); i++){
            if(arr[s.charAt(i) - 'a'] == -1){
                arr[s.charAt(i) - 'a'] = i;
            }
            else{
                res = Math.max(res, i - arr[s.charAt(i) - 'a']);
                arr[s.charAt(i) - 'a'] = i;
            }
        }
        System.out.println(res-1);
    }
}
