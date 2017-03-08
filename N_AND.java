
package vlt;

/**
 * This class represents an AND gate of N size
 * See Part class for further details
 * 
 * @author Parker
 */
public class N_AND extends Part{

    public N_AND(String name){
        super(name);
        ports.add(new Port("a",this));
        ports.add(new Port("b",this));
        ports.add(new Port("x",this));
    }
}
