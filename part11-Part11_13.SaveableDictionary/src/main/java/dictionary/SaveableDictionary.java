/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mahdi
 */
public class SaveableDictionary {

    private HashMap<String, String> dicos;
    private String file;

    public SaveableDictionary() {
        this.dicos = new HashMap();

    }

    public SaveableDictionary(String file) {
        this();
        this.file = file;
    }

    public void add(String words, String translation) {
        
            this.dicos.putIfAbsent(words, translation);
        
        
            this.dicos.putIfAbsent(translation, words);
        
    }

    public String translate(String word) {
        return this.dicos.get(word);
    }

    public void delete(String word) {
        this.dicos.remove(dicos.get(word));
        this.dicos.remove(word);
        
    }

    public boolean load() {
        try {
            Files.lines(Paths.get(file)).map(row -> row.split(":")).forEach(parts -> this.add(parts[0], parts[1]));;
            return true;
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }

    public boolean save() {

        try {
            PrintWriter pw = new PrintWriter(file);
            saveWords(pw);
            pw.close();
            return true;

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
            return false;
        }

    }
    
    
    private void saveWords(PrintWriter writer) {

        List<String> allreadySaved = new ArrayList<>();

        dicos.keySet().stream().forEach(word -> {

            if (allreadySaved.contains(word)) {

                return;

            }

 

            String pari = word + ":" + dicos.get(word);

            writer.println(pari);

 

            allreadySaved.add(word);

            allreadySaved.add(dicos.get(word));

        });

    }

}
