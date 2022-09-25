package DemoProgs;

import java.util.Arrays;
public class Q2TCS {
    public static char axis = 'X';
    public static int axisCord[] = {0,0};
    public static int[] finalAxisCord = {-7, 6};
    public static void changeAxis(){
       if(axis == 'Y'){
           axis = 'X';
           changeIndex();
       }
       else{
           axis = 'Y';
           changeIndex();
       }
    }
    public static void changeIndex(){
        if(axis == 'Y'){
            if(finalAxisCord[1] < axisCord[1]){
                axisCord[1]--;
            }
            else if(finalAxisCord[1] > axisCord[1]){
                axisCord[1]++;
            }
        }
        else{
            if(finalAxisCord[0] < axisCord[0]){
                axisCord[0]--;
            }
            else if(finalAxisCord[0] > axisCord[0]){
                axisCord[0]++;
            }
        }
    }
    public static void main(String[] args) {
        String s = "1011010101101111101";
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0'){
                changeAxis();
            }
            else if(s.charAt(i) == '1'){
                changeIndex();
            }
        }
        boolean flag = false;
        if(Arrays.equals(finalAxisCord, axisCord)){
            System.out.println("Yes");
            flag = true;
        }
        else{
            axisCord[0] = 0;
            axisCord[1] = 0;
            axis = 'Y';
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '0'){
                    changeAxis();
                }
                else if(s.charAt(i) == '1'){
                    changeIndex();
                }
            }
        }
        if(Arrays.equals(finalAxisCord, axisCord) && !flag){
            System.out.println("Yes");
        }
        else if(!flag)
            System.out.println("No");
    }
}
