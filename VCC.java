
package vlt;

/**
 * Serves as the part place holder for VCC
 * 
 * @author Parker
 */
public class VCC extends Part{
    
    public VCC(String name){
        super(name);
        ports.add(new Port("port",this));
    }
}
