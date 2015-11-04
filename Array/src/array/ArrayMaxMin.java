package array;

public class ArrayMaxMin {

    public static void main(String[] args) {
        int[] a = {2, 4, 67, -30, 56};
        int max = a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {

            System.out.println(a[i]);

            if (max < a[i]) {
                max = a[i];
            }
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println("Max: " + max);
        System.out.println("Min:" + min);
    }
}
