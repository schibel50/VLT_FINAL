package vlt;

/**
 * This class represents a Comparator part
 * See Part class for further details
 * 
 * @author Parker
 */
public class Comparator extends Part{
    
    public Comparator(String name){
        super(name);
        ports.add(new Port("a",this));
        ports.add(new Port("b",this));
        ports.add(new Port("Greater",this));
        ports.add(new Port("Equal",this));
        ports.add(new Port("Less",this));
    }
}
//">>","<<","~","&","|","~&","~|","~^","^~","%"