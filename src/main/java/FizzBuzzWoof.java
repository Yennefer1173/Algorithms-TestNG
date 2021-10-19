import java.util.Arrays;

public class FizzBuzzWoof {

    public static String[] fizzBuzzWoof(int startnumber, int endnumber) {

        String[] numbers = new String[endnumber - startnumber + 1];
        int newNumber = startnumber;

        for (int i = startnumber - startnumber; i < (endnumber - startnumber + 1); i++) {

            while(newNumber > 0) {
                if(newNumber % 10 == 3) {
                    numbers[i] = "Fizz";
                } else if (newNumber % 10 == 5) {
                    numbers[i] = "Buzz";
                } else if (newNumber % 10 == 7) {
                    numbers[i] = "Woof";
                }
                newNumber=newNumber/10;
            }
            if (newNumber % 3 == 0) {
                numbers[i] = "Fizz";
            } else if (newNumber % 5 == 0) {
                numbers[i] = "Buzz";
            } else if (newNumber % 7 == 0) {
                numbers[i] = "Woof";
            } else {numbers[i] = String.valueOf(newNumber);

            }
            newNumber += 1;
        }
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }
}
