public class BottlesOfBeer_99 {

    public static void bottlesOfBeer_99() {

                /*99 bottles of beer on the wall, 99 bottles of beer.
                Take one down and pass it around, 98 bottles of beer on the wall.*/

        for (int i = 99; i > 1; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\n" +
            "Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
            System.out.println();
        }
        System.out.println("1 bottle of beer on the wall, 1 bottle of beer.\n" +
                "Take one down and pass it around, no more bottles of beer on the wall.");
        System.out.println();
        System.out.println("No more bottles of beer on the wall, no more bottles of beer.\n" +
                "Go to the store and buy some more, 99 bottles of beer on the wall.");


    }
}
