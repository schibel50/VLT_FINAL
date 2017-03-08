package vlt;

/**
 * Serves as the part place holder for Ground
 * 
 * @author Parker
 */
public class Ground extends Part{
    
    public Ground(String name){
        super(name);
        ports.add(new Port("port",this));
    }
    
}
