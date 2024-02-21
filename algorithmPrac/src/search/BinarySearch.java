package search;

public class BinarySearch {
    public static int[] TEST_SEARCH_ARRAY = {1,2,3,4,5,6,7,8,9,10};
    public static void main(String[] args) {
        int targetNumber = 1;
        int count = 0;
        int start = 0;
        int end = TEST_SEARCH_ARRAY.length - 1 ;

        while (start <= end){
            int pointer = (start + end) / 2 ;
            System.out.println("pointer = " + pointer);
            count += 1;

            if (TEST_SEARCH_ARRAY[pointer] > targetNumber){
                end = pointer - 1;
            } else if (TEST_SEARCH_ARRAY[pointer] < targetNumber){
                start = pointer + 1;
            } else {
                System.out.println(count);
                break;
            }
        }
    }
}

