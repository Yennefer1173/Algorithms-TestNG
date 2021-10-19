import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzWoofTest {

    @Test
    public void testFizzBuzz() {
        int startnumber = 1;
        int endnumber = 15;
        String[] expectedResult =
                {"1", "2", "Fizz", "4", "Buzz", "Fizz", "Woof", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizz"};

        String[] actualResult = FizzBuzzWoof.fizzBuzzWoof(startnumber, endnumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
