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
public interface Playable {
        
    /** 
     * Returns an integer representing the number of times the sounds
     * should be played.
     */
    public int numberOfMoments();

     /** 
     * Returns a String representing the first sound the instrument makes.
     */
    public String getSoundOne();
    
     /** 
     * Returns a String representing the second sound the instrument makes.
     */
    public String getSoundTwo();
    
         /** 
     * Returns a String representing the third sound the instrument makes.
     */
    public String getSoundThree();
     
}
