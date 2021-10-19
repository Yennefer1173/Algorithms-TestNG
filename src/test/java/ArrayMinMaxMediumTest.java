import org.junit.Test;

import java.util.Arrays;

public class ArrayMinMaxMediumTest {


    @Test
    public void testArrayMinMaxMedium() {
        int[] array = {-3, 0, 155, -39, 1003};
        int[] result = ArrayMinMaxMedium.getArrayMinMaxMedium(array);

        System.out.println(Arrays.toString(result));
    }
}
