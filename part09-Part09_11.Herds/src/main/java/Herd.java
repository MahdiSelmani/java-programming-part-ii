
import java.util.ArrayList;
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
public class Herd implements Movable {

    private List<Movable> items;
    
    public Herd() {
        this.items = new ArrayList();
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable i : items) {
            i.move(dx, dy);
        }
    }
    
    @Override
    public String toString() {
        String m ="";
        for (Movable i : items) {
           m+= i.toString()+"\n";
        }
        return m ;
    }

    public void addToHerd(Movable movable) {
        this.items.add(movable);
    }
    
}
