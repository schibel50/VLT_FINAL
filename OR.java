package vlt;

/**
 * This class represents an OR gate
 * See Part class for further details
 * 
 * @author Parker
 */
public class OR extends Part{

    public OR(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("Y",this));
    }  
}
