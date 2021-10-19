import org.junit.Test;

public class NumberComparisonTest {

    @Test
    public void testComparison() {
        int a = 89;
        int b = 89;

        System.out.println(NumberComparison.getComperison(a, b));
    }

    @Test
    public void testComparison1() {
        int a = -89;
        int b = 89;

        System.out.println(NumberComparison.getComperison(a, b));
    }

    @Test
    public void testComparison2() {
        int a = 89;
        int b = -89;

        System.out.println(NumberComparison.getComperison(a, b));
    }
}
