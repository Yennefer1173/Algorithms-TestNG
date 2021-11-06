import org.junit.Test;

public class WorkWithStringTest {

    @Test
    public void testGetstrings1() {
        String s = "I love you!!!";
        int a = 4;
        WorkWithString.getString1(s, a);
    }

    @Test
    public void testGetstrings2() {
        String s = "QAForEveryone";
        System.out.println(WorkWithString.getString2(s));
        String ss = "Java";
        System.out.println(WorkWithString.getString2(ss));
        String sss = "A";
        System.out.println(WorkWithString.getString2(sss));
    }
}
