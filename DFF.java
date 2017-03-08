package vlt;

/**
 * This class represents a D Flip-Flop part
 * See Part class for further details
 * 
 * @author Parker
 */
public class DFF extends Part{
    
    public DFF(String name){
        super(name);
        ports.add(new Port("S'",this));
        ports.add(new Port("R'",this));
        ports.add(new Port("Ck",this));
        ports.add(new Port("D",this));
        ports.add(new Port("Q",this));
        ports.add(new Port("Q'",this));
    }

}
