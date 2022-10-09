
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int first = 0, second = 0;

        while (true) {

            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");
            String input = scan.nextLine();
            String[] parts = input.split(" ");
            if (input.equals("quit")) {

                break;
            }
            int m = Integer.valueOf(parts[1]);
            if (m < 0) {
                continue;
            }
            if (parts[0].equals("add")) {

                if (first < 100) {
                    if (first + Integer.valueOf(parts[1]) > 100) {
                        first = 100;
                    } else {
                        first += Integer.valueOf(parts[1]);
                    }
                }
            }

            if (parts[0].equals("move")) {

                if (first - m < 0) {

                    if (second + m > 100) {
                        second = 100;
                    } else {
                        second += first;
                    }
                    first = 0;
                } else {
                    first -= m;
                    if (second + m > 100) {
                        second = 100;
                    } else {
                        second += m;
                    }

                }

            }

            if (parts[0].equals("remove")) {
                if (second - m >= 0) {
                    second -= m;
                } else {
                    second = 0;
                }

            }

        }
    }

}
