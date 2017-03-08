package vlt;

/**
 * This class represents an AND4 gate part
 * See Part class for further details
 * 
 * @author Parker
 */
public class AND4 extends Part{

    public AND4(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("C",this));
        ports.add(new Port("D",this));
        ports.add(new Port("Y",this));
    }
}
