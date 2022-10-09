
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // test your method here
        

    }
    
    public static int sum(int[] array, int fromWhere, int toWhere, int smallest, int largest){
        int sum = 0 ;
        int startIndex = fromWhere;
        int endIndex = toWhere;

        if (fromWhere < 0) {
            startIndex = 0;
        }
        if (toWhere > array.length ) {
            endIndex = array.length ;
        }
        
        
        for (int i = startIndex ; i < endIndex ; i ++) {
            
            if ( array[i]<largest && array[i]>smallest ) sum+= array[i];
        }
        
        return sum ;
    }

}
