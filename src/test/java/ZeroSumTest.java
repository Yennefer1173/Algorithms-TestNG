import org.junit.Test;

import java.util.Arrays;

public class ZeroSumTest {

    @Test
    public void testZeroSum() {
        int[] array = {35, 23, 12, 89, -23, -48, 100};
        int[] result = ZeroSum.getZeroSum(array);
        System.out.println(Arrays.toString(result));
    }
}
