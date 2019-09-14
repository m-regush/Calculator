import Test_Task.Math;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException, Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String parts[] = a.split(" ");
        String part1 = parts[0];
        String part2 = parts[1];
        String part3 = parts[2];
        String regex = "[0-9]+";


        if (part1.equals("I") || part1.equals("II") || part1.equals("III") || part1.equals("IV") || part1.equals("V") ||
                part1.equals("VI") || part1.equals("VII") || part1.equals("VIII") || part1.equals("IX") || part1.equals("X") &
                part3.equals("I") || part3.equals("II") || part3.equals("III") || part3.equals("IV") || part3.equals("V") ||
                part3.equals("VI") || part3.equals("VII") || part3.equals("VIII") || part3.equals("IX") || part3.equals("X")) {
            int x = Converter.toRomanian(part1);
            int y = Converter.toRomanian(part3);
            if (x > 10 || x < 1 || y > 10 || y < 1) {
                throw new Exception();
            }
            int sum = Math.Solution(x, y, part2);
            String c = Converter.convert(sum);
            System.out.println(c);

        } else if (part1.matches(regex) || part3.matches(regex)) {
            int x = Integer.parseInt(part1);
            int y = Integer.parseInt(part3);
            if (x > 10 || x < 1 || y > 10 || y < 1) {
                throw new Exception();
            }

            System.out.println(Math.Solution(x, y, part2));
        }


    }


}







