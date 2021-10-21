public class BooleanSumDigit {

    /*Напишите метод, который принимает массив целых положительных чисел
    (в массиве четное количество элементов),
    и возвращает true, если сумма чисел в первой половине массива
    больше суммы чисел во второй половине массива.
    Иначе возвращается false

    Test Data:
    Input = {4, 6, 3, 7, 1, 2}
    Expected Result = true

    Input = {12, 48, 15, 125}
    Expected Result = false*/


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
