
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
public class DictionaryOfManyTranslations {

    private HashMap<String, ArrayList<String>> myHash;

    public DictionaryOfManyTranslations() {
        this.myHash = new HashMap();
    }

    public void add(String word, String translation) {
        myHash.putIfAbsent(word, new ArrayList<String>());
        myHash.get(word).add(translation);
        

    }

    public ArrayList<String> translate(String word) {
        if (myHash.containsKey(word)) {
            return myHash.get(word);
        } else {
            return new ArrayList();
        }

    }

    public void remove(String word) {
        myHash.remove(word);

    }

}
