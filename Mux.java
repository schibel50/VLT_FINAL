package vlt;

/**
 * This class represents a Multiplexer part
 * See Part class for further details
 * 
 * @author Parker
 */
public class Mux extends Part{
    
    public Mux(String name){
     super(name);
           ports.add(new Port("a",this));
           ports.add(new Port("b",this));
           ports.add(new Port("sel",this));
           ports.add(new Port("y",this));
    }
}
