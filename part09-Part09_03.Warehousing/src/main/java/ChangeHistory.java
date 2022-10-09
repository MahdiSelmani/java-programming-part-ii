
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
public class ChangeHistory {

    private ArrayList<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history.clear();
    }

    public String toString() {
        return this.history.toString();
    }

    public double maxValue() {
        double max = this.history.get(0);

        for (double d : history) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double minValue() {
        double min = this.history.get(0);

        for (double d : history) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;

        for (double d : history) {
            sum += d;
        }

        return sum / history.size();
    }

}
