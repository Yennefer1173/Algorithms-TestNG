import java.util.Arrays;

public class AscendingSequence {

    /*Написать алгоритм AscendingSequence, который строит
    возрастающую последовательность чисел от a до b с шагом n.
    Test Data:
    a =  10
    b =  25
    n =  5
    Expected result = {10, 15, 20, 25}


    a =  10
    b =  -25
    n =  -5
    Expected result = {-1}

    a =  10
    b =  10
    n =  2
    Expected result = {-1}*/

    public static String AscendSequence(int a, int b, int n) {

        if(b < a || b == a) {
            return "{-1}";
        }
        int lengthArray = (b - a) / n + 1;
        int[] array = new int[lengthArray];
        array[0] = a;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i - 1] + n;
        }
        return Arrays.toString(array);
    }
}
