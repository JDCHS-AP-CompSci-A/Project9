/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Orchestra;

/**
 *
 * @author jacobwhitehead
 */
public class ElectricDrum extends Instrument {
    
public String getName(){
    return "Electric Drum";
}    
    
public String getDescription(){
    return "A cool instrument that makes a cool electronic drum noise.";
    
}   

public int numberOfMoments(){
    return 2;
}

public String getSoundOne(){
    return "Badadum Badadum Badadum";
    
}

public String getSoundTwo(){
    return "Bum Bum Bum Bum Bum Bum";
    
}

public String getSoundThree(){
    return "Badum Bum BUUUMM";
    
}

public String toString() {
    return this.getName() + "\n" + this.getDescription();
}






    
}
