package sort;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by nikolay on 30.07.14.
 */
public class Shuffle {

    public static void shuffle(int[] a){
        Random random = new Random();
        for (int i = 1; i < a.length; i++){
            int r = random.nextInt(i);
            int temp = a[r];
            a[r] = a[i];
            a[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5,6,7,8,9,10};
        Shuffle.shuffle(a);
        System.out.println(Arrays.toString(a));
    }
}
