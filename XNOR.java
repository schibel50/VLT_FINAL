package vlt;

/**
 * This class represents an XNOR gate
 * See Part class for further details
 * 
 * @author Parker
 */
public class XNOR extends Part{
    public XNOR(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("Y",this));
    }
}

