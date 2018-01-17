/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orchestra;

import Orchestra.Instrument;

/**
 *
 * @author josegalang
 */
public class Theremin extends Instrument{
    
    public String getName() {
        return "Theremin";
    }
    
    public String getDescription() {
        return "an electronic musical instrument controlled without physical contact";
    }
    
    public int numberOfMoments() {
        return 3;
    }

     /** 
     * Returns a String representing the first sound the instrument makes.
     */
    public String getSoundOne() {
        return "WEEEEEOOOOOOOOOOOOO";
    }
    
     /** 
     * Returns a String representing the second sound the instrument makes.
     */
    public String getSoundTwo() {
        return "WEEEEAAAAAAAAHHHHHH";
    }
         /** 
     * Returns a String representing the third sound the instrument makes.
     */
    public String getSoundThree() {
        return "WOOOOOOOOOOOOOAAAAH";    
    }
    
    public String toString() {
        return this.getName() + "\n" + this.getDescription();
    }
}