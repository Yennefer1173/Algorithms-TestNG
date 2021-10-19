import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class AscendingSequenceTest {

    int a;
    int b;
    int n;

    @Test
    public void getAscendSequence() {
        a = 10;
        b = 25;
        n = 5;
        int[] array1 = {10, 15, 20, 25};
        Assert.assertEquals(Arrays.toString(array1), AscendingSequence.AscendSequence(a, b, n));
    }

    @Test
    public void getAscendSequence1() {
        a = 10;
        b = -25;
        n = -5;
        int[] array1 = {-1};
        Assert.assertEquals(Arrays.toString(array1), AscendingSequence.AscendSequence(a, b, n));
    }
}
