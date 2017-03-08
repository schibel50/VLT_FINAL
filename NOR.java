package vlt;

/**
 * This class represents a NOR gate
 * See Part class for further details
 * 
 * @author Parker
 */
public class NOR extends Part{
    public NOR(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("Y",this));
    }
}
