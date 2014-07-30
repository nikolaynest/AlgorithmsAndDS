package sort;

import java.util.Arrays;

/**
 * Created by nikolay on 30.07.14.
 */
public class InsertionSort {

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 3, 7, 4, 2, 8, 6, 1, 9};
        System.out.println(Arrays.toString(arr));
        System.out.println("---------------------");
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
