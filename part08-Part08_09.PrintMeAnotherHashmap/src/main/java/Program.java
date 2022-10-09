
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }
    
    
    
    public static void printValues(HashMap<String,Book> hashmap){
        for (Book e : hashmap.values()){
            System.out.println(e);
        }
    }
    
    public static void printValueIfNameContains(HashMap<String,Book> hashmap, String text){
        for (Book e : hashmap.values()){
            if (e.getName().contains(text)){
                System.out.println(e);
            }
        }
    }
}
