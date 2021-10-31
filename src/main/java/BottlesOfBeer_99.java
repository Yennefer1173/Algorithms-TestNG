import java.util.Locale;

public class BottlesOfBeer_99 {

    public String bildNewString(String string, int index, char letter) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            if (i != index && string.charAt(i) != letter) {
                result += string.charAt(i);
            }

        }

        return result;
    }

    public void printBottlesOfBeer_99() {
        String bottles = " bottles of beer";
        String wall = " on the wall";
        String noMore = "No more";
        String go = "Go to the store and buy some more";
        String comaSpace = ", ";
        String dot = ".";
        String take = "Take one down and pass it around";

        for (int i = 99; i >= 0; i--) {
            if (i == 2) {
                System.out.println(i + bottles + wall + comaSpace + i + bottles + dot + "\n" +
                        take + comaSpace + (i - 1) + bildNewString(bottles, 7, 's') + wall + dot);
                System.out.println();
            } else if (i == 1) {
                System.out.println(i + bildNewString(bottles, 7, 's') + wall + comaSpace + i + bildNewString(bottles, 7, 's') + dot + "\n" +
                        take + comaSpace + noMore.toLowerCase() + bottles + wall + dot);
                System.out.println();
            } else if (i == 0) {
                System.out.println(noMore + bottles + wall + comaSpace + noMore.toLowerCase() + bottles + dot + "\n" +
                        go + comaSpace + 99 + bottles + wall + dot);
            } else {
                System.out.println(i + bottles + wall + comaSpace + i + bottles + dot + "\n" +
                        take + comaSpace + (i - 1) + bottles + wall + dot);
                System.out.println();
            }
        }


    }

}
