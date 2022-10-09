
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> mylist = new ArrayList();

        // toteuta ohjelmasi tänne
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
                String command = scanner.nextLine();
                if (command.equals("n")) {
                    System.out.println(mylist.stream().mapToInt(s -> s).filter(s -> s < 0).average().getAsDouble());
                    break;
                }
                if (command.equals("p")) {
                    System.out.println(mylist.stream().mapToInt(s -> s).filter(s -> s > 0).average().getAsDouble());
                    break;

                }
                if (command.isEmpty()) {
                    continue;
                }

            }
            mylist.add(Integer.valueOf(input));
        }

    }
}
