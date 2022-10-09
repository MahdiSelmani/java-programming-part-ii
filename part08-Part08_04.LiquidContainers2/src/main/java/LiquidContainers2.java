
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container first = new Container();
        Container second = new Container();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            String input = scan.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];

            if (input.equals("quit")) {
                break;
            }
            int m = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(m);
            }

            if (command.equals("move")) {
                if (first.contains() > m) {
                    first.remove(m);
                    second.add(m);
                }else{
                    second.add(first.contains());
                }

            }

            if (command.equals("remove")) {
                second.remove(m);
            }

        }
    }

}
