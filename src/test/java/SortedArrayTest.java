import org.junit.Test;

import java.util.Arrays;

public class SortedArrayTest {

    @Test
    public void testSortedArray() {
        int[] array = {12, 2, 3, 4, 5};
        System.out.println(Arrays.toString(SortedArray.getSortedArray(array)));
    }

    @Test
    public void testSortedArray1() {
        int[] array = {-3, 0, 155, -39, 1003};
        System.out.println(Arrays.toString(SortedArray.getSortedArray(array)));
    }
    
}
