package vlt;

/**
 * This class represents a Bit Shift Right part
 * See Part class for further details
 * 
 * @author Parker
 */
public class BitShiftR extends Part{
    public int amount;
    
    public BitShiftR(String name, int amount){
        super(name);
        this.amount = amount;
        ports.add(new Port("in",this));
        ports.add(new Port("out",this));
    }
}
