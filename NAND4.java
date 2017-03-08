package vlt;

/**
 * This class represents a NAND4 gate
 * See Part class for further details
 * 
 * @author Parker
 */
public class NAND4 extends Part{
    public NAND4(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("C",this));
        ports.add(new Port("D",this));
        ports.add(new Port("Y",this));
    }
}