import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class OddEvenTest {

    long numb;
    OddEven oddEven = new OddEven();

    @Test
    public void getOddEven() {
        numb = -345;
        String actualResult = oddEven.OddEven(numb);

        Assert.assertEquals("Odd", actualResult);
    }

    @Test
    public void getOddEven1() {
        numb = 222222;
        String actualResult = oddEven.OddEven(numb);

        Assert.assertEquals("Even", actualResult);
    }

    @Test
    public void getOddEven2() {
        numb = 0;
        String actualResult = oddEven.OddEven(numb);

        Assert.assertEquals("Even", actualResult);
    }

    @Test
    public void getOddEven3() {
        numb = 2147483648L;
        String actualResult = oddEven.OddEven(numb);

        Assert.assertEquals("Undefined", actualResult);
    }

    @Test
    public void getOddEven4() {
        numb = -486579998775644L;
        String actualResult = oddEven.OddEven(numb);

        Assert.assertEquals("Undefined", actualResult);
    }


}
