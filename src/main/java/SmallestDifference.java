public class SmallestDifference {

    public static int[] getSmallestDifference(int[] array) {
        int[] result = new int[2];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (Math.abs(array[i] - array[j]) < min) {
                    min = array[i] - array[j];
                    result[0] = array[i];
                    result[1] = array[j];
                }
                if (Math.abs(array[j] - array[i]) < min) {
                    min = array[j] - array[i];
                    result[0] = array[j];
                    result[1] = array[i];
                }
            }
        }

        return result;
    }
}
