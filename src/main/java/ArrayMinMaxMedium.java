public class ArrayMinMaxMedium {

    /*Написать алгоритм, который принимает массив чисел int[]
    и возвращает массив, который содержит максимальное число, минимальное число и среднее.

    Test Data:
    {1, 2, 3, 4, 5} -> {5, 1, 3}
    {-3, 0, 155, -39, 1003} -> {1003, -39, 223}*/

    public static int[] getArrayMinMaxMedium(int[] array) {

        int[] result = new int[3];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int forMedium = 0;
        for (int i = 0; i < array.length; i++) {
            forMedium += array[i];
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        result[0] = max;
        result[1] = min;
        result[2] = forMedium / array.length;

        return result;
    }

}
