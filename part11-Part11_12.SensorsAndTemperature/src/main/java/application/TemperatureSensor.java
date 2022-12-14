/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;

/**
 *
 * @author Mahdi
 */
public class TemperatureSensor implements Sensor {

    private boolean isOn;

    @Override
    public boolean isOn() {
        return this.isOn;
    }

    @Override
    public void setOn() {
        this.isOn = true;
    }

    @Override
    public void setOff() {
        this.isOn = false;
    }

    @Override
    public int read() {
        if (isOn) {
            Random rand = new Random();
            return rand.nextInt(61) - 30 ;
        } else {
            throw new IllegalStateException();
        }
    }

}
