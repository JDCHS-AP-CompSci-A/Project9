/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orchestra;

/**
 *
 * @author kylliefurukawa
 */
public class Triangle extends Instrument {
    
    public String getName() {
        return "Triangle"; 
    } 
    
    public String getDescription() {
        return "A triangle-shaped, hand-held metal instrument, played by " 
                + "striking another piece of metal against it.";
    }
    
    public int numberOfMoments() {
        return 1; 
    }
    
    public String getSoundOne() {
        return "ding"; 
    }
    
    public String getSoundTwo() { 
        return "DING"; 
    }
    
    public String getSoundThree() {
        return "diNG"; 
    }
    
    public String toString() {
        return this.getName() + "\n" + this.getDescription(); 
    }
}
