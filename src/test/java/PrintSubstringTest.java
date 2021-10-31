import org.junit.Assert;
import org.junit.Assume;
import org.junit.Test;

import java.util.List;

public class PrintSubstringTest {

    @Test
    public void testPrintSubstring1() {
        String s = "Java lessons are fun";
        PrintSubstring.printSubstring(s);
    }

    @Test
    public void testPrintSubstring2() {
        String s = "QAForEveryone";
        String expectedResult = "AoEeyn";
        String actualResult = PrintSubstring.getString(s);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPrintSubstring3() {
        String s = "Java less0ns are fun";
        String expectedResult = "Java lessons are fun";
        String actualResult = PrintSubstring.getReplacement(s);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPrintSubstring4() {
        String s = "Java lessons  are fun";
        int expectedResult = 4;
        int actualResult = PrintSubstring.getNumberOfSpaces(s);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPrintSubstring5() {
        String s = "Java lessons  are fun";
        String expectedResult = "javalessonsarefun";
        String actualResult = PrintSubstring.getNewString(s);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPrintSubstring6() {
        String s = " Java lessons  are fun";
        String expectedResult = "JAVA LESSONS ARE FUN";
        String actualResult = PrintSubstring.getNewString1(s);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPrintSubstring7() {
        String s = "Java lessons are fun";
        int expectedResult = 7;
        int actualResult = PrintSubstring.getNumberOfVowels(s);
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPrintSubstring8() {
        String s = "45 тысяч 378";
        System.out.println(PrintSubstring.getDigit(s));
    }

}
