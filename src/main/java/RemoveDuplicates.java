public class RemoveDuplicates {

    /*Написать  алгоритм RemoveDuplicates, который принимает на вход массив чисел,
    и возвращает массив уникальных чисел.

    Test Data
    {3, 4, 2, 6, 4, 3, 3, 3, 2, 2} -> {3, 4, 2, 6}
    {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0} -> {0, 1, 2, 3, 4, 5}*/

    public static int getDuplicates(int[] array) {
        int duplicates = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
               if (array[i] == array[j]) {
                   duplicates +=1;
               }
            }
        }
        return duplicates;
    }

   /* public static int[] getArray(int[] array, int duplicates) {
        int[] result = new int[array.length - duplicates];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] != array[j]) {

                }
            }
        }
    }*/
}
