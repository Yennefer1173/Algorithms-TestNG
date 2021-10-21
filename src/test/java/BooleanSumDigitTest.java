import org.junit.Test;

public class BooleanSumDigitTest {

    @Test
    public void testBooleanSumDigit() {
        int[] array = {4, 6, 3, 7, 1, 2};
        System.out.println(BooleanSumDigit.getBooleanSumDigit(array));
    }

    @Test
    public void testBooleanSumDigit2() {
        int[] array = {12, 48, 15, 125};
        System.out.println(BooleanSumDigit.getBooleanSumDigit(array));
    }

    @Test
    public void testBooleanSumDigit3() {
        int[] array = {12, 12, 12, 13, 12, 12};
        System.out.println(BooleanSumDigit.getBooleanSumDigit(array));
    }
}
