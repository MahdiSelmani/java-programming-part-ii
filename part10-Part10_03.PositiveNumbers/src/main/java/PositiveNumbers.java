
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> mylist = numbers.stream().filter(s -> s > 0).collect(Collectors.toCollection(ArrayList::new));
        return mylist;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here

    }

}
