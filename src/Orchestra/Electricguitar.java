/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orchestra;

/**
 *
 * @author nicholasreagan
 */
public class Electricguitar extends Instrument{
    
    public String getName(){
        return "Electric Guitar";
    }
    
    public String getDescripstion(){
        return "A guitar except it uses the zappy stuff";
    }
    
    public int numberOfMoments(){
        return 1;
    }
    
    public String getSoundOne(){
        return "WAHHHHH";
    }
    
    public String getSoundTwo(){
        return "*shredding*";
    }
    
    public String getSoundThree(){
        return "Don't Fear the Reaper riff";
    }
    
    public String toString() {
        return this.getName() + "\n" + this.getDescription();
    }
    
}
