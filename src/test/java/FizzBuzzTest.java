import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        int startnumber = 1;
        int endnumber = 15;
        String[] expectedResult =
                {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"};

        FizzBuzz fizzBuzzObj = new FizzBuzz();
        String[] actualResult = fizzBuzzObj.fizzBuzz(startnumber, endnumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
