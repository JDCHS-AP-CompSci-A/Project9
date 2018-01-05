/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orchestra;

/**
 *
 * @author michael
 */
public class Cowbell extends Instrument {
     /** 
     * Returns an String representing the name of the instrument.
     */
    public String getName() {
        return "Cowbell";
    }
    
     /** 
     * Returns a String representing the description of the instrument.
     */
    public String getDescription() {
        return "A beautiful instrument that makes a glorious 'Ding'"
                + "... Music to all ears.";
    }
    
     /** 
     * Returns an integer representing the number of times the sounds
     * should be played.
     */
    public int numberOfMoments() {
        return 1;
    }
    
    /** 
     * Returns a String representing the first sound the instrument makes.
     */
    public String getSoundOne() {
        return "DING";
        
    }
    
     /** 
     * Returns a String representing the second sound the instrument makes.
     */
    public String getSoundTwo() {
        return "DIING";
    }
    
         /** 
     * Returns a String representing the third sound the instrument makes.
     */
    public String getSoundThree() {
        return "DIIING";
    }
    
    public String toString() {
        return this.getName() + "\n" + this.getDescription();
    }
    
    
}
