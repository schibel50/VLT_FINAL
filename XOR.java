package vlt;

/**
 * This class represents an XOR gate
 * See Part class for further details
 * 
 * @author Parker
 */
public class XOR extends Part{

    public XOR(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("Y",this));
    }
}
