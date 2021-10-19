public class OddEven {

    public String OddEven(long numb) {
        String res = "";
        if (numb > Integer.MAX_VALUE || numb < Integer.MIN_VALUE) {
            res = "Undefined";
        } else if (numb >= 0) {
            res = "Even";
        } else if (numb < 0) {
            res = "Odd";
        }

        return res;
    }


}
