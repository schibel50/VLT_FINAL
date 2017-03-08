package vlt;

/**
 * This class represents a Subtractor part
 * See Part class for further details
 *
 * @author Ryan
 */
public class Subtractor extends Part{
    Subtractor(String name){
        super(name);
        ports.add(new Port("a",this));
        ports.add(new Port("b",this));
        ports.add(new Port("cin",this));
        ports.add(new Port("y",this));
        ports.add(new Port("cout",this));
    }
}
