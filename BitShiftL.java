package vlt;

/**
 * This class represents a Bit Shift Left part
 * See Part class for further details
 * 
 * @author Parker
 */
public class BitShiftL extends Part{
    public int amount;
    public BitShiftL(String name, int amount){
        super(name);
        this.amount = amount;
        ports.add(new Port("in",this));
        ports.add(new Port("out",this));
    }
}
