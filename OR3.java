package vlt;

/**
 * This class represents an OR3 gate
 * See Part class for further details
 * 
 * @author Parker
 */
public class OR3 extends Part{

    public OR3(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("C",this));
        ports.add(new Port("Y",this));
    }  
}
