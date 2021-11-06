import java.util.ArrayList;
import java.util.List;

public class WorkWithString {

    /*Напишите метод, который выводит строковый параметр  n раз
    и показывает количество символов в новой строке.*/

    public static void getString1(String string, int n) {
        char[] a = string.toCharArray();
        int quantitySymbols = 0;
        for (Character character : a) {
            quantitySymbols += 1;
        }
        String quantitySymbolsString = Integer.toString(quantitySymbols);
        for (int i = 1; i < n + 1; i ++) {
            System.out.println(string.concat(quantitySymbolsString));
        }
    }

    /*Напишите метод, который принимает строковый параметр и возвращает слово,
    которое состоит из последних трех и первых трех букв слова-параметра,
    если длина строки больше 5. Иначе метод возвращает слово,
    состоящее из средней/средних буквы/букв слова-параметра, повторенных столько раз, какова длина строки.

            Пример:
    method(“QAForEveryone”) -> “oneQAF”
    method(“Java”) -> “avavavav”
    method(“A”) -> “A”*/

    public static String getString2(String string) {
        String result = "";
        if (string.length() > 5) {
            result = string.substring((string.length() - 3), string.length()).concat(string.substring(0, 3));
        } else {
            if (string.length() % 2 != 0) {
                result = string.substring(string.length() / 2, string.length() / 2 + 1).repeat(string.length());
            } else {
                result = string.substring(string.length() / 2 - 1, string.length() / 2 + 1).repeat(string.length());
            }
        }

        return result;
    }

    /*Напишите метод, который в строке находит слова минимальной и максимальной длины,
    и количество слов одинаковой длины (максимально одинаковой).

            “What a wonderful day!” -> [“a”, “wonderful”, “0”]
            “I love to learn Java!” -> [“I”, “learn”, “2”]*/






}
