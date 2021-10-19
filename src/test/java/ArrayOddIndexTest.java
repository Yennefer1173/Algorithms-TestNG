import org.junit.Assert;
import org.junit.Test;

public class ArrayOddIndexTest {

    ArraysOddIndex arraysOddIndex = new ArraysOddIndex();

   @Test
    public void getArrayOddIndex() {

       long[] array = {-45, 590, 234, 985, 12, 68};
       long[] expectedResult = {590, 985, 68};
       Assert.assertArrayEquals(expectedResult, arraysOddIndex.getArray(array));
   }

    @Test
    public void getArrayOddIndex1() {

        long[] array = {-45, 590, 234, 985, 12, 68, 33, -345495767};
        long[] expectedResult = {590, 985, 68, -345495767};
        Assert.assertArrayEquals(expectedResult, arraysOddIndex.getArray(array));
    }

    @Test
    public void getArrayOddIndex2() {

        long[] array = {-45, 590, 234, 985, 12, 68, 33};
        long[] expectedResult = {590, 985, 68};
        Assert.assertArrayEquals(expectedResult, arraysOddIndex.getArray(array));
    }

    @Test
    public void getArrayOddIndex3() {

        long[] array = {-45, 590};
        long[] expectedResult = {590};
        Assert.assertArrayEquals(expectedResult, arraysOddIndex.getArray(array));
    }

    @Test
    public void getArrayOddIndex4() {

        long[] array = {-45};
        long[] expectedResult = {};
        Assert.assertArrayEquals(expectedResult, arraysOddIndex.getArray(array));
    }

    @Test
    public void getArrayOddIndex5() {

        long[] array = {};
        long[] expectedResult = {};
        Assert.assertArrayEquals(expectedResult, arraysOddIndex.getArray(array));
    }

}
