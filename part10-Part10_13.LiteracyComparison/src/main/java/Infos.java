/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahdi
 */
public class Infos implements Comparable<Infos> {

    private String country, gender;
    private int year;
    private double percent;

    public Infos(String country, int year, String gender, double percent) {
        this.country = country;
        this.gender = gender;
        this.year = year;
        this.percent = percent;
    }
    
    public double getYear(){
        return year ;
    }

    public void printInfos() {
        System.out.println(country + " (" + year + "), " + gender + ", " + percent);
    }

    @Override
    public int compareTo(Infos o) {
        return Double.compare(percent, o.percent);
    }

}
