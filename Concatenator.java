package vlt;

/**
 * This class represents a Concatenator part
 * See Part class for further details
 * 
 * @author Parker
 */
public class Concatenator extends Part{
    
    public Concatenator(String name, int numIns){
        super(name);
        for(int i = 0; i < numIns; i++)
            ports.add(new Port("in-"+i, this));
        ports.add(new Port("out",this));
    }
}
