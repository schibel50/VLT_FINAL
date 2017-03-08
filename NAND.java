package vlt;

/**
 * This class represents a NAND gate
 * See Part class for further details
 * 
 * @author Parker
 */
public class NAND extends Part{
    public NAND(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("Y",this));
    }
}
