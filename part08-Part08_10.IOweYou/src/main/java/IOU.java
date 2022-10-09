
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mahdi
 */
public class IOU {

    private HashMap<String, Double> hash;

    public IOU() {
        this.hash = new HashMap();

    }

    public void setSum(String toWhom, double amount) {
        hash.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        if (hash.containsKey(toWhom)){
            return hash.get(toWhom);
        }
        return 0 ;
    }

}
