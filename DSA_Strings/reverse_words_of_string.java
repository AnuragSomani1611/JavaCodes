package DSA_Strings;
public class reverse_words_of_string {
    public static void main(String[] args) {
        String a = "i love india";
        int start = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) == ' '){
                a = reverse(a, start, i-1);
                start = i+1;
            }
        }
        a = reverse(a,start,a.length()-1);
        a = reverse(a,0,a.length()-1);
        System.out.println(a);
    }
    public static String reverse(String a, int start, int end){
        char []arr = a.toCharArray();
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;end--;
        }
        return String.valueOf(arr);
    }
}
