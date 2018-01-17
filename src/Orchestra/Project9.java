/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orchestra;

import java.util.ArrayList;

/**
 *
 * @author michael
 */
public class Project9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Instrument kazoo = new Kazoo();
        Instrument electricguitar = new ElectricGuitar();
        //add your new instrument to this list
        ArrayList<Instrument> orchestra =  new ArrayList<Instrument>();
        orchestra.add(kazoo);
        orchestra.add(electricguitar);
        
        System.out.println("Welcome to the orchestra, please sit back... relax and enjoy!\n");
        System.out.println("We will be playing the following instruments.\n");

        for(int i = 0; i < orchestra.size(); i++) {
            Instrument current_instrument = orchestra.get(i);
            System.out.println(current_instrument);
        }  
         
        System.out.println("\nLet us begin!");

       
        for(int i = 0; i < orchestra.size(); i++) {
            Instrument current_instrument = orchestra.get(i);

            for(int j = 0; j < current_instrument.numberOfMoments(); j++){
                System.out.println(current_instrument.getSoundOne());
                System.out.println(current_instrument.getSoundTwo());
                System.out.println(current_instrument.getSoundThree());
            } 
            
            System.out.println("");
        }  
    }
}