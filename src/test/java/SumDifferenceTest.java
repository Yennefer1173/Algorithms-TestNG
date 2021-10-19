import org.junit.Assert;
import org.junit.Test;

public class SumDifferenceTest {

    SumDifference sumDifference = new SumDifference();

    @Test
    public void testSumDifference() {
        long a = 1;
        long n = 3;

        Assert.assertEquals(6, sumDifference.getSumDifference(a, n));
    }

    @Test
    public void testSumDifference1() {
        long a = 1;
        long n = 222;

        Assert.assertEquals(24753, sumDifference.getSumDifference(a, n));
    }

    @Test
    public void testSumDifference2() {
        long a = 1;
        long n = -10;

        Assert.assertEquals(56, sumDifference.getSumDifference(a, n));
    }

    @Test
    public void testSumDifference3() {
        long a = 1;
        long n = -3;

        Assert.assertEquals(7, sumDifference.getSumDifference(a, n));
    }

}
