package vlt;

/**
 * This class represents a Combiner part
 * See Part class for further details
 * 
 * @author Parker
 */
public class Combiner extends Part{
    
    public Combiner(String name, int size, int number){
        super(name+number);
        ports.add(new Port(name+number+"-out",this));
        for(int i = 0; i < size;i++){
            ports.add(new Port(name+number+"-"+i,this));
        }
    }
}
