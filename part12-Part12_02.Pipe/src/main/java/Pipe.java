
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
public class Pipe<T> {

    private ArrayList<T> store;

    public Pipe() {
        this.store = new ArrayList();
    }

    public void putIntoPipe(T value) {
        this.store.add(value);
    }

    public T takeFromPipe() {
        T t = null;
        if (!store.isEmpty()) {
            t = store.get(0);
            this.store.remove(store.get(0));
        } else {

        }
        return t;
    }

    public boolean isInPipe() {
        return !store.isEmpty();
    }
}
