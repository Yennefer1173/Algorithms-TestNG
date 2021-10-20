import org.junit.Test;

import java.util.Arrays;

public class TwoSumTest {

    @Test
    public void testTwoSum1() {
        int[] array = {68, 5, 2, 100, 9, 12, 8};
        int targetNumber = 10;
        int[] result = TwoSum.getTwoSum(array, targetNumber);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testTwoSum2() {
        int[] array = {1, 20, 40, 60, -40, -20, -1};
        int targetNumber = -19;
        int[] result = TwoSum.getTwoSum(array, targetNumber);
        System.out.println(Arrays.toString(result));
    }

    @Test
    public void testTwoSum3() {
        int[] array = {8, 5, 2, 0, 9, 12, 8};
        int targetNumber = 12;
        int[] result = TwoSum.getTwoSum(array, targetNumber);
        System.out.println(Arrays.toString(result));
    }
}
