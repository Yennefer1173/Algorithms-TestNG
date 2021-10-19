public class SumDifference {

    /*Написать алгоритм, который возвращает сумму всех чисел от 1 до n,
    если последовательность чисел возрастающая;
    и возвращает разницу всех чисел,
    если последовательность чисел убывающая.


    Test Data:
    n = 222;
    Expected result = 24 753
    n = -10;
    Expected result = 56;*/


    public long getSumDifference(long a, long n) {
        a = 1;
        long result = 0;
        if (n > 1) {
            result = 0;
            for (int i = 1; i < n + 1; i++) {
                result += i;
            }
        } else if (n < 1) {
            result = 1;
            for (int i = 0; i > n - 1; i--) {
                result -= i;
            }
        }

        return result;
    }
}
