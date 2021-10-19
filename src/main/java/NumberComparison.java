public class NumberComparison {

    /*Напишите метод, который принимает на вход 2 любых int числа, и возвращает
0, если числа равны
-1, если первое число меньше второго
1, если первое число больше второго

    Test Data:
            89, 89
    Expected result: 0
            -89, 89
    Expected result: -1
            89, -89
    Expected result: 1*/

    public static int getComperison(int a, int b) {
        int resalt = 0;
        if (a < b) {
            resalt = -1;
        } else if (a > b) {
            resalt = 1;
        } else {
            resalt = 0;
        }

        return resalt;
    }

}
