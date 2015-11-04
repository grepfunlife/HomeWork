package array;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortDesc {

    public static void main(String[] args) {
        Integer[] a = new Integer[5];
        System.out.println("Befor sort:");
        for (int i = 0; i < a.length; i++) {
            a[i] =  (int)(Math.random() * 100);
            System.out.println(a[i]);
        }
        Arrays.sort(a, Collections.reverseOrder());
        System.out.println("After sort:");
        for (int i = 0; i < a.length; i++) {
            
            System.out.println(a[i]);
        }

    }

}
