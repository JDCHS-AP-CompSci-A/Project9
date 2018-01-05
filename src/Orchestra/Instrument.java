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
public abstract class Instrument implements Playable {

     /** 
     * Returns an String representing the name of the instrument.
     */
    public String getName() {
        return "Basic Instrument";
    }
    
     /** 
     * Returns a String representing the description of the instrument.
     */
    public String getDescription() {
        return "Basic Instrument Description";
    }
    
}
