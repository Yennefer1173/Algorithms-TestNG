public class ZeroSum {

    /*Написать алгоритм ZeroSum,
    который принимает на вход массив целых чисел
    и возвращает массив из двух чисел, сумма которых равна 0.

    Test Data:
    {35, 23, 12, 89, -23, -48, 100}
    Expected result = {23, -23}*/

    public static int[] getZeroSum(int[] array) {
        int[] result = new int[2];
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] * -1) {
                    result[0] = array[i];
                    result[1] = array[j];
                }
            }
        }

        return result;
    }

}
