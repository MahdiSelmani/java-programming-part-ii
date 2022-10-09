/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahdi
 */
public class CD implements Packable {
    
    
    private String name, artist ;
    private int year ;
    private final double weight = 0.1 ;
    
    public CD(String name, String artist, int year ){
        this.name = name ;
        this.artist = artist ;
        this.year = year ;
    }
    

    @Override
    public double weight() {
        return this.weight ;
    }
    
    @Override 
    public String toString(){
        return this.name+": "+this.artist+" ("+this.year+")";
    }
    
}
