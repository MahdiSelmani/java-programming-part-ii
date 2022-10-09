
import java.util.ArrayList;
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
public class StorageFacility {

    private HashMap<String, ArrayList<String>> list;

    public StorageFacility() {
        this.list = new HashMap<String, ArrayList<String>>();
    }

    public void add(String unit, String item) {
        list.putIfAbsent(unit, new ArrayList<String>());
        list.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        if (list.containsKey(storageUnit)) {
            return list.get(storageUnit);
        } else {
            return new ArrayList();
        }
    }

    public void remove(String storageUnit, String item) {
        for (String i : list.get(storageUnit)) {
            if (i.equals(item)) {
                list.get(storageUnit).remove(i);
                break;
            }
        }
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> newList = new ArrayList();
        for (String e : list.keySet()) {
             if(!list.get(e).isEmpty()){
                
                newList.add(e);
            }
        }
        return newList;
    }
}
