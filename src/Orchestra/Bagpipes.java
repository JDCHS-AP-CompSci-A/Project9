/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orchestra;

/**
 *
 * @author edwardlamb
 */
public class Bagpipes extends Instrument {
    
    public String getName(){
    return "Bagpipes";
    }
    
    public String getDescription(){
    return "A bag with some pipes sticking out of it, pretty straight forward.";
    }
    
    public int numberOfMoments(){
    return 1;
    }
    
    public String getSoundOne(){
    return "(Horrible bagpipe noises)";
    }
    
    public String getSoundTwo(){
    return "(The awful noises continue)";
    }
    
    public String getSoundThree(){
    return "(The man's ears start bleading as he stops playing.)";
    }
    
    public String toString() {
        return this.getName() + "\n" + this.getDescription();
    }
}
