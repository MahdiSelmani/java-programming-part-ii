
import java.util.HashMap;

public class Program {

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String e : hashmap.keySet()) {
            System.out.println(e);

        }

    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String e : hashmap.keySet()) {
            if (e.contains(text)) {
                System.out.println(e);
            }

        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        for (String e : hashmap.keySet()) {
            if (e.contains(text)) {
                System.out.println(hashmap.get(e));
            }

        }
    }

    public static void main(String[] args) {
        // Test your program here!
    }

}
