import java.util.Arrays;

public class SortedArray {

    public static int[] getSortedArray(int[] array) {
        Arrays.sort(array);

        return array;
    }











        /* int[] result = new int[array.length];
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j > i; j++) {
                if (array[j] > array[j + 1]) {
                    int a = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = a;
                }

            }
        }
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;*/

}
