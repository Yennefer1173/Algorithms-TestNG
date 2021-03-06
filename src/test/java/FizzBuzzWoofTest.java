import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzWoofTest {

    @Test
    public void testFizzBuzzWoof() {
        int n = 35;
        String[] expectedResult ={"1",
                "2",
                "FizzFizz",
                "4",
                "BuzzBuzz",
                "Fizz",
                "WoofWoof",
                "8",
                "Fizz",
                "Buzz",
                "11",
                "Fizz",
                "Fizz",
                "Woof",
                "FizzBuzzBuzz",
                "16",
                "Woof",
                "Fizz",
                "19",
                "Buzz",
                "FizzWoof",
                "22",
                "Fizz",
                "Fizz",
                "BuzzBuzz",
                "26",
                "FizzWoof",
                "Woof",
                "29",
                "FizzFizzBuzz",
                "Fizz",
                "Fizz",
                "FizzFizz",
                "Fizz",
                "FizzBuzzBuzzWoof"};


        String[] actualResult = FizzBuzzWoof.getFizzBuzzWoof(n);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}
