package vlt;

/**
 * This class represents an AND gate part
 * See Part class for further details
 * 
 * @author Parker
 */
public class AND extends Part{

    public AND(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("Y",this));
    }
}
