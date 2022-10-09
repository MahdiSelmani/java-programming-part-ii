
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("How many random numbers should be printed?");
        int num = scanner.nextInt();
        
        for (int i = 0 ; i < num ; i++){
            Random r = new Random() ;
            System.out.println(r.nextInt(11));
        }
    }

}
