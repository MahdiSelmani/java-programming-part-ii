
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mahdi
 */
public class Box implements Packable {

    private double maxCapacity;
    private ArrayList<Packable> items;

    public Box(double max) {
        this.maxCapacity = max;
        this.items = new ArrayList();
    }

    public void add(Packable p) {
        if (p.weight() + this.weight() <= maxCapacity) {
            this.items.add(p);
        }
    }

    @Override
    public double weight() {
        double w = 0;
        for (Packable p : items) {
            w += p.weight();
        }
        return w;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " items, total weight " + this.weight() + " kg";
    }

}
