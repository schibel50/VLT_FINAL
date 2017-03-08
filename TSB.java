package vlt;

/**
 * This class represents a Tri-State-Buffer part
 * See Part class for further details
 * 
 * @author Parker
 */
public class TSB extends Part{
    public TSB(String name){
        super(name);
        ports.add(new Port("A1",this));
        ports.add(new Port("Y1",this));
        ports.add(new Port("G1",this));
    }
}
