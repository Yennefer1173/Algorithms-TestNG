public class TrueFalse {

    /*Напишите метод, который возвращает true,
    если численный  параметр больше или равен нулю,
    и возвращает false, если параметр меньше 0.
    Проверьте работу метода на числах 555, 0 и -555.*/


    public static boolean getTrueFalse(int a) {
        boolean resalt = false;
        if (a >= 0) {
            resalt = true;
        } else
            resalt = false;

        return resalt;
    }
}
