public class ArraysOddIndex {

    public long[] getArray(long[] array) {

        int length = array.length / 2;
        long[] result = new long[length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }
}
