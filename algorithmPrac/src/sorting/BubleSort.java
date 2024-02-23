package sorting;

import java.util.Arrays;
import java.util.Random;

public class BubleSort {

    public static int[] TEST_SORT_ARRAY = {5,9,11,1,2,6,7,8,3,4,15,20};

    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int[] array = new int[10];

            for (int j = 0; j < 10; j++) {
                array[j] = random.nextInt(20);
            }

            for (int j = 0; j < array.length-1 ; j++) {
                for (int k = j+1; k < array.length; k++) {
                    if (array[j] > array[k]){
                        int temp = array[j];
                        array[j] = array[k];
                        array[k] = temp;
                    }
                }
            }

            System.out.println(Arrays.toString(array));
        }
    }
}
