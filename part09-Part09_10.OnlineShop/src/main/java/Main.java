
public class Main {

    public static void main(String[] args) {
        // Test your app here
        Warehouse w = new Warehouse();
        w.addProduct("coffee", 2, 25);
        w.addProduct("milk", 3, 10);
        w.price("cheese");
    }
}
