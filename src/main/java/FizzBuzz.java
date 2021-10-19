import java.util.Arrays;

public class FizzBuzz {

    public String[] fizzBuzz(int startnumber, int endnumber) {

        String[] numbers = new String[endnumber - startnumber + 1];
        int newNumber = startnumber;
        for (int i = startnumber - startnumber; i < (endnumber - startnumber + 1); i++) {
           if (newNumber % 15 ==0) {
               numbers[i] = "FizzBuzz";
           } else if (newNumber % 3 == 0) {
                numbers[i] = "Fizz";
            } else if (newNumber % 5 == 0) {
                numbers[i] = "Buzz";
            } else {numbers[i] = String.valueOf(newNumber);

            }
            newNumber += 1;
        }
        System.out.println(Arrays.toString(numbers));

        return numbers;
    }
}
