package DemoProgs;

import java.util.*;
public class LinkedListSwap {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> newList = new LinkedList<>();
        int n = scan.nextInt();
        while(n>0){
            newList.add(n);
            n = scan.nextInt();
        }
        for(int i = 0; i<newList.size()-1; i+=2){
            swap(newList, newList.get(i),  newList.get(i+1));
        }
        for (int i : newList) {
            System.out.print(i + " ");
        }
    }
    public static void swap(LinkedList<Integer> list, int ele1, int ele2)
    {
        int index1 = list.indexOf(ele1);
        int index2 = list.indexOf(ele2);
        if (index1 == -1 || index2 == -1) {
            return;
        }
        list.set(index1, ele2);
        list.set(index2, ele1);
    }
}
