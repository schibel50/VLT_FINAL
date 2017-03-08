package vlt;

/**
 * This class represents an OR4 gate
 * See Part class for further details
 * 
 * @author Parker
 */
public class OR4 extends Part{

    public OR4(String name){
        super(name);
        ports.add(new Port("A",this));
        ports.add(new Port("B",this));
        ports.add(new Port("C",this));
        ports.add(new Port("D",this));
        ports.add(new Port("Y",this));
    }  
}