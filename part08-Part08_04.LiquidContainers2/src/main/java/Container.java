/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mahdi
 */
public class Container {
    private int amount ;
    
    public Container(){
        
    }
    public int contains(){
        return this.amount ;
    }
    
    public void add(int a){
        if (a>0){
            if (this.amount+a<=100){
                this.amount += a ;
            }else{
                this.amount = 100 ;
            }
        }
    }
    
    public void remove(int a){
        if (a>0){
            if (this.amount - a > 0) {
                this.amount -= a ;
            }else{
                this.amount = 0 ;
            }
        }
    }
    
    
    @Override
    public String toString(){
        return this.amount+"/100" ;
    }
    
    
    
    
    
}
