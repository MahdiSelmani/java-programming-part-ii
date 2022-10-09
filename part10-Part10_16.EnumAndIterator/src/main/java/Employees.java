
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mahdi
 */
public class Employees {

    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList();
    }

    public void add(Person personToAdd) {
        employees.add(personToAdd);
    }

    public void add(List<Person> peopleToAdd) {
        for (Person p : peopleToAdd) {
            employees.add(p);
        }
    }

    public void print() {
         Iterator<Person> iterator = employees.iterator();
        
         while (iterator.hasNext()){
             Person p = iterator.next();
             System.out.println(p);
         }
    }

    public void print(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()) {
            Person nextPerson = iterator.next();
            if (nextPerson.getEducation()==education) {
                System.out.println(nextPerson);
            }
            
        }

    }

    public void fire(Education education) {
        Iterator<Person> iterator = employees.iterator();
        while (iterator.hasNext()){
            Person nextPerson = iterator.next();
            if( nextPerson.getEducation()==education) iterator.remove();
        }

    }

}
