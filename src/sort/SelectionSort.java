package sort;

import java.util.Arrays;

/**
 * Created by nikolay on 30.07.14.
 */
public class SelectionSort {

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            if (min!=i){
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,8,2,9,4,1,3,6,7};
        System.out.println(Arrays.toString(a));
        System.out.println("-----------");
        SelectionSort.sort(a);
        System.out.println(Arrays.toString(a));
    }

}
