public class Max {

    public static int getMax(int a, int b) {
        int result = 0;
        if (a > b) {
            result = a;
        } else if (b > a) {
            result = b;
        } else result = a;

        return result;
    }
}
