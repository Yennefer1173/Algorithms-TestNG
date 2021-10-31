import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class PrintSubstring {

     /*Написать метод, который принимает на ход строку и печатает все буквы “q”, “o” и “r” из этой строки:

    Test Data
 “QAForEveryone”
 “Java lessons are fun”*/

    public static void printSubstring(String string) {

        String newstr = string.toLowerCase();
        char[] str = newstr.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'q' || str[i] == 'o' || str[i] == 'r') {
                System.out.print(str[i] + ", ");
            }
        }
    }

    /*Написать метод, который принимает строку и возвращает строку,
    которая состоит только из букв на нечетных индексах
    (для построения новой строки использовать метод concat() или просто +):

    Test Data:
            “QAForEveryone” -> “AoEeyn”
            “JavaLessonsAreFun” -> “aaesnAeu”*/

    public static String getString(String string) {
        String result = "";
        char[] s = string.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (i % 2 != 0) {
                result += s[i];
            }
        }

        return result;
    }

    /*Написать метод, который принимает строку и заменяет все цифры 0 на букву “o”.

    Test Data:
            “QAF0rEvery0ne” -> “QAForEveryone” ”
            “Java less0ns are fun” -> “Java lessons are fun”*/

    public static String getReplacement(String string) {
        String result = string.replace("0", "o");

        System.out.println(result);
        return result;
    }

    /*Написать метод, который принимает строку, и возвращает количество пробелов в этой строке

    Test Data:
            “QA For Everyone” -> 2
            “Java lessons  are fun” -> 4*/

    public static int getNumberOfSpaces(String string) {
        char[] a = string.toCharArray();
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ' ') {
                result += 1;
            }
        }

        return result;
    }

    /*Написать метод, который удалит все пробелы из входящей строки,
    и заменит все большие буквы на маленькие.

    Test Data:
            “QA For  Everyone ” -> “qaforeveryone”
            “ Java lessons  are fun” -> “javalessonsarefun”*/

    public static String getNewString(String string) {
        String result1 = string.replace(" ", "");
        String result = result1.toLowerCase(Locale.ROOT);

        return result;
    }

    /*Написать метод, который переведет строку в upper case и уберет все ЛИШНИЕ пробелы

    Test Data:
            “QA For  Everyone ” -> “QA FOR EVERYONE”
            “ Java lessons  are fun” -> “JAVA LESSONS ARE FUN”*/

    public static String getNewString1(String string) {

        String result1 = string.replace("  ", " ");
        String result2 = result1.trim();
        String result = result2.toUpperCase();

        return result;
    }

   /* Написать метод, который посчитает количество гласных букв в строке.
    Для нахождения гласных букв использовать метод contains()
(гласные буквы - “a”, “e”, “i”, “o”, “u”)

    Test Data:
            “QA For Everyone” -> 6
            “Java lessons are fun” -> 7*/

    public static int getNumberOfVowels(String string) {
        int result = 0;
        char[] a = string.toLowerCase().toCharArray();
        for (int i = 0; i < a.length; i++) {
          if (a[i] == 97 || a[i] == 101 || a[i] == 105 || a[i] == 111 || a[i] == 117) {
              result += 1;
          }
        }
        return result;
    }

    /*Написать метод, который все цифры из входящей строки вернет в виде List<Integer>.

    Test Data:
            “QA 4 Every1” -> [4, 1]
            “45 тысяч 378” -> [4, 5, 3, 7, 8]*/

    public static List<Integer> getDigit(String string) {
        List<Integer> list = new ArrayList<>();
        char[] a = string.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 47 && a[i] < 58) {
                list.add((int) a[i] - 48);
            }
        }

        return list;
    }


}
