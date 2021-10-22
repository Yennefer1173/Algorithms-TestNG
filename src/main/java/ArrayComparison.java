import java.util.Arrays;

public class ArrayComparison {

    /*Напишите метод, который принимает на вход 2 массива целых положительных чисел,
    и возвращает true, если каждый элемент первого массива равен элементу второго массива с тем же индексом

    Test Data:
    {1, 2, 3, 4, 5}
    {1, 2, 3, 4, 5}
    Expected result: true

    {1, 2, 3, 4, 6}
    {1, 2, 3, 4, 5}
    Expected result: false*/


    public static boolean getArrayComparison(int[] array1, int[] array2) {

        return Arrays.equals(array1, array2);
    }


    public static boolean getArrayComparison1(int[] array1, int[] array2) {
        boolean comparison = false;
        if (array1.length != array2.length) {
            comparison = false;
        } else {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array2.length; j++) {
                    if (array1[i] == array2[j]) {
                        comparison = true;
                    } else {
                        comparison = false;
                    }
                }
            }
        }

        return comparison;
    }


}
