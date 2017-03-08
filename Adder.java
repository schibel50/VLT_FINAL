package vlt;

/**
 * This class represents an Adder part
 * See Part class for further details
 * 
 * @author Parker
 */
public class Adder extends Part{
    
    public Adder(String name){
        super(name);
        ports.add(new Port("a",this));
        ports.add(new Port("b",this));
        ports.add(new Port("cin",this));
        ports.add(new Port("y",this));
        ports.add(new Port("cout",this));
    }
}
