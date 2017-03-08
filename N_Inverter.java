package vlt;

/**
 * This class represents a NOT gate of N size
 * See Part class for further details
 * 
 * @author Parker
 */
public class N_Inverter extends Part{
    public N_Inverter(String name){
        super(name);
        ports.add(new Port("a",this));
        ports.add(new Port("b",this));
    }
}
