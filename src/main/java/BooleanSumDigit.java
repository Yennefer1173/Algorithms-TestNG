public class BooleanSumDigit {

    public static boolean getBooleanSumDigit(int[] array) {
        int a = 0;
        int b = 0;
        boolean s = false;
        for (int i = 0; i < array.length / 2; i++) {
            a += array[i];
        }
        for (int j = array.length / 2; j < array.length; j++) {
            b += array[j];
        }

        if (a > b) {
            s = true;
        } else {
            s = false;
        }

        return s;
    }
}
