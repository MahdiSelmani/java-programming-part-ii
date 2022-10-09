/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mahdi
 */
public class AverageSensor implements Sensor {

    private ArrayList<Sensor> sensors;
    private ArrayList<Integer> listOfAv;

    public AverageSensor() {
        this.sensors = new ArrayList();
        this.listOfAv = new ArrayList();
    }

    public void addSensor(Sensor toAdd) {
        this.sensors.add(toAdd);
    }

    @Override
    public boolean isOn() {
        boolean verif = true;
        for (Sensor s : sensors) {
            if (!s.isOn()) {
                verif = false;
            }
        }
        return verif;
    }

    @Override
    public void setOn() {
        for (Sensor s : sensors) {
            s.setOn();
        }
    }

    @Override
    public void setOff() {
        for (Sensor s : sensors) {
            s.setOff();
        }
    }

    @Override
    public int read() {
        if (!sensors.isEmpty()) {
            listOfAv.add((int) sensors.stream().mapToInt(s -> s.read()).average().getAsDouble());
            return (int) sensors.stream().mapToInt(s -> s.read()).average().getAsDouble();
            
            
        } else {
            throw new IllegalStateException() ;
        }

    }
    
    public List<Integer> readings(){
        return listOfAv;
        
        
    }

}
