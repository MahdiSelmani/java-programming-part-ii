
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {

                System.out.println(mylist.stream().mapToInt(s -> s).average().getAsDouble());
                break;
            }
            mylist.add(Integer.valueOf(input));
        }

    }
}
