package vlt;

/**
 * This class represents a Multiplier part
 * See Part class for further details
 * 
 * @author Parker
 */
public class Multiplier extends Part{
    
    public Multiplier(String name){
        super(name);
        ports.add(new Port("a",this));
        ports.add(new Port("b",this));
        ports.add(new Port("x",this));
    }
}
