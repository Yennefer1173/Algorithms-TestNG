import org.junit.Test;

import java.util.Arrays;

public class SmallestDifferenceTest {

    @Test
    public void testSmallestDifference() {
        int[] array = {8, 5, 2, 0, 9, 12, 8};
        System.out.println(Arrays.toString(SmallestDifference.getSmallestDifference(array)));
    }

    @Test
    public void testSmallestDifference1() {
        int[] array = {8, -55, 2, -54, -12};
        System.out.println(Arrays.toString(SmallestDifference.getSmallestDifference(array)));
    }

}
