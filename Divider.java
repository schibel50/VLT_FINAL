package vlt;

/**
 * This class represents a Divider part
 * See Part class for further details
 * Note: not implemented; future teams can elaborate on this
 * 
 * @author Parker
 */
public class Divider extends Part{
    
    public Divider(String name){
        super(name);
        ports.add(new Port("a",this));
        ports.add(new Port("b",this));
        ports.add(new Port("x",this));
    }
}
