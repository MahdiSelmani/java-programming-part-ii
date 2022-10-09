
import java.util.ArrayList;


public class Main {
    public static void printPersons(ArrayList<Person> persons){
        for (Person p : persons){
            System.out.println(p);
        }
    }
    public static void main(String[] args) {
        // write your test code here
        
       Student m = new Student("Mahdi","Le kef tunisie 7100");
        System.out.println(m);
        m.study();
        System.out.println(m);
    }

}
