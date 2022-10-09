
public class Main {

    public static void main(String[] args) {
        // test your classes here
        Box box = new Box(2);
        Book book = new Book("mahdi", "mahdi", 1.2);
        box.add(book);
        System.out.println(box);
    }

}
