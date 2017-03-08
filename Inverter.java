package vlt;

/**
 * This class represents an Inverter part
 * See Part class for further details
 * 
 * @author Parker
 */
public class Inverter extends Part{
    public Inverter(String name){
        super(name);
        ports.add(new Port("In",this));
        ports.add(new Port("Y",this));
    }
}
