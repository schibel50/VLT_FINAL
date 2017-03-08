package vlt;

/**
 * This class represents a NOR3 gate
 * See Part class for further details
 * 
 * @author Parker
 */
public class NOR3 extends Part{
    public NOR3(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("C",this));
        ports.add(new Port("Y",this));
    }
}