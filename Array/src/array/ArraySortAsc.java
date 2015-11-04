package array;

import java.util.Arrays;

public class ArraySortAsc {

    public static void main(String[] args) {
        int[] a = new int[5];
        System.out.println("Befor sort:");
        for (int i = 0; i < a.length; i++) {
            a[i] =  (int)(Math.random() * 100);
            System.out.println(a[i]);
        }
        Arrays.sort(a);
        System.out.println("After sort:");
        for (int i = 0; i < a.length; i++) {
            
            System.out.println(a[i]);
        }

    }

}
