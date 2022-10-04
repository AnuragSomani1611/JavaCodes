package DSA_Strings;

public class check_anagram {
    public static void main(String[] args) {
        int ch = 256;
        int arr[] =new int[ch];
        String a = "anurag";
        String b = "garuna";
        for(int i = 0; i < a.length(); i++){
            arr[a.charAt(i)]++;
            arr[b.charAt(i)]--;
        }
        for(int i = 0; i < ch; i++){
            if(arr[i] != 0){
                System.out.println("NO");
                break;
            }
        }
    }
}
