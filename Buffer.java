package vlt;

/**
 * This class represents a Buffer part
 * See Part class for further details
 * 
 * @author Parker
 */
public class Buffer extends Part{
    
    public Buffer(String name){
        super(name);
        ports.add(new Port("In",this));
        ports.add(new Port("Y",this));
    }
}
