
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
public class Hideout<T> {

    private ArrayList<T> store;

    public Hideout(T t) {
        this.store = new ArrayList();

    }

    public void putIntoHideout(T toHide) {
        store.add(toHide);
    }

    public T takeFromHideout() {
        T t = store.get(0);
        store.clear();
        return t;
    }

    public boolean isInHideout() {
        return store.isEmpty();
    }

}
