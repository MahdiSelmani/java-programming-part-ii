
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList();
        
        while (true) {
            int input = scanner.nextInt();
            if (input == 0) {
                double sum = 0 ;
                int nbr = 0 ;
                double average  ;
                for (int n : numbers){
                    if (n>0){
                        sum += n ;
                        nbr ++;
                    }
                }
                average = sum/nbr;
                if (average>0){
                    System.out.println(average);
                }else{
                    System.out.println("Cannot calculate the average");
                }
                break;
                
                
            }
            numbers.add(input);
            
        }

    }
}
