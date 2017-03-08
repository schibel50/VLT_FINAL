package vlt;

/**
 * This class represents an OR gate of N size
 * See Part class for further details
 * 
 * @author Parker
 */
public class N_OR extends Part{

    public N_OR(String name){
        super(name);
        ports.add(new Port("a",this));
        ports.add(new Port("b",this));
        ports.add(new Port("x",this));
    }
}

  