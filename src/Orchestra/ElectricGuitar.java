
package Orchestra;


public class ElectricGuitar extends Instrument{
    
     public String getName() {
        return "Electric Guitar";
    }
     
     public String getDescription() {
        return "Like a regular guitar except it uses that zappy stuff";
    }
     
     public int numberOfMoments() {
        return 1;
    }
     
     public String getSoundOne() {
        return "WAAAAAHHHHHHHH";
        
    }
     
     public String getSoundTwo() {
        return "*shredding*";
    }
    
    public String getSoundThree() {
        return "Don't Fear The Reaper riff";
    }
    
    public String toString() {
        return this.getName() + "\n" + this.getDescription();
    }
    
}
