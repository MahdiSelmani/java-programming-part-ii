
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Divisible {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(-17);
        numbers.add(-5);
        numbers.add(7);

        ArrayList<Integer> divisible = divisible(numbers);

        divisible.stream()
                .forEach(luku -> System.out.println(luku));
    }

    public static ArrayList<Integer> divisible(ArrayList<Integer> numbers) {
        ArrayList mylist = numbers.stream().filter(s -> s % 2 == 0).collect(Collectors.toCollection(ArrayList::new));
        numbers.stream().filter(s -> s % 3 == 0).forEach(s -> mylist.add(s));
        numbers.stream().filter(s -> s % 5 == 0).forEach(s -> mylist.add(s));

        return mylist;
    }

}
