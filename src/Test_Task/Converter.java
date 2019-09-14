import java.io.IOException;

public class Converter {
    public static int toRomanian(String romanNumber) throws IOException {
        if (romanNumber.equals("I")) return 1;
        if (romanNumber.equals("II")) return 2;
        if (romanNumber.equals("III")) return 3;
        if (romanNumber.equals("IV")) return 4;
        if (romanNumber.equals("V")) return 5;
        if (romanNumber.equals("VI")) return 6;
        if (romanNumber.equals("VII")) return 7;
        if (romanNumber.equals("VIII")) return 8;
        if (romanNumber.equals("IX")) return 9;
        if (romanNumber.equals("X")) return 10;
        else {
            throw new IOException();
        }
    }

    public static String toArabian(int n, String one, String five, String ten) {

        if (n >= 1) {
            if (n == 1) {
                return one;
            } else if (n == 2) {
                return one + one;
            } else if (n == 3) {
                return one + one + one;
            } else if (n == 4) {
                return one + five;
            } else if (n == 5) {
                return five;
            } else if (n == 6) {
                return five + one;
            } else if (n == 7) {
                return five + one + one;
            } else if (n == 8) {
                return five + one + one + one;
            } else if (n == 9) {
                return one + ten;
            }

        }
        return "";
    }

    public static String convert(int number) {

        String romanianOnes = toArabian(number % 10, "I", "V", "X");
        number /= 10;
        String romanianTens = toArabian(number % 10, "X", "L", "C");
        number /= 10;
        String romanianHundreds = toArabian(number % 10, "C", "D", "M");

        String result = romanianHundreds + romanianTens + romanianOnes;
        return result;
    }
}




