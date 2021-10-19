public class GoodBadNumber {

    /*Given an integer M perform the following conditional actions:
    If M is multiple of 3 and 5 then return "Good Number".
    If M is only multiple of 3 and not of 5 then return "Bad Number"
    If M is only multiple of 5 and not of 3 then return "Poor Number"
    If M doesn't satisfy any of the above conditions then return "-1"*/

    /*Для целого числа M выполните следующие условные действия:
    Если M кратно 3 и 5, то верните "Хорошее число".
    Если M кратно только 3, но не 5, то верните "Плохое число".
    Если M кратно только 5 и не кратно 3, то возвращается "Плохое число".
    Если M не удовлетворяет ни одному из вышеперечисленных условий, то возвращается "-1".*/

    public static String getGoodBadNumber(int a) {
        String resalt = "";
        if (a % 3 == 0 && a % 5 == 0) {
            resalt = "Хорошее число";
        } else if (a % 3 == 0 && a % 5 != 0) {
            resalt = "Плохое число";
        } else if (a % 5 == 0 && a % 3 != 0) {
            resalt = "Плохое число";
        } else {
            resalt = "-1";
        }

        return resalt;
    }

}
