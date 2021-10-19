import java.util.Arrays;

public class FizzBuzzWoof {

    //FizzBuzzWoof

//Печать целых чисел от 1 до N, 1 < N < 100
// но печатать:
// "Fizz", если целое число делится на 3
// "Fizz", если целое число содержит 3,
// "Buzz", если целое число делится на 5
// "Buzz", если целое число содержит 5,
// "Woof", если целое число делится на 7
// "Woof", если целое число содержит 7
    //Основные правила в этой игре: любое число,
//которое содержит число или делится на это число, заменяется вхождением слова.
//Если число имеет 2 экземпляра этого числа (т. Е. 33 или 55) и делится на это число,
//то слово произносится в этом примере три раза.


    public static boolean isDigitPresent(int a, int b) {
        while (a > 0) {
            if (a % 10 == b) {
                break;
            }
            a /= 10;
        }

        return a > 0;
    }

    public static String fizzBuzzWoofNumber(int a) {

        String result = "";

        if (a % 3 == 0) {
            result += "Fizz";
        }
        if (FizzBuzzWoof.isDigitPresent(a, 3)) {
            result += "Fizz";
        }
        if (a % 5 == 0) {
            result += "Buzz";
        }
        if (FizzBuzzWoof.isDigitPresent(a, 5)) {
            result += "Buzz";
        }
        if (a % 7 == 0) {
            result += "Woof";
        }
        if (FizzBuzzWoof.isDigitPresent(a, 7)) {
            result += "Woof";
        }

        return result;
    }

    public static String[] getFizzBuzzWoof(int n) {
        String[] array = new String[n];
        String result = "";

        for (int i = 0; i < array.length; i++) {
            String text = FizzBuzzWoof.fizzBuzzWoofNumber(i + 1);
            if (text.equals("")) {
                result = Integer.toString(i + 1);
            } else {
                result = text;
            }
            array[i] = result;
        }

        System.out.println(Arrays.toString(array));

        return array;
    }
}