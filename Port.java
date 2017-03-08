package vlt;

/**
 * This class represents the various ports used throughout the program
 * 
 * @author Ryan
 */
public class Port {
    
    String name;
    Part part; //if part is null, this is an input/output to the whole circuit/module
    byte IO;//if -1, output; if +1, input
    
    //constructor for if this is being attached to a part
    public Port(String name,Part part){
        this.name = name;
        this.part = part;
        this.IO = 0;
    }
    
    //constructor for if this being used as an Input/Output
    public Port(String name, byte IO){
        this.name = name;
        this.IO = IO;
        this.part=null;
    }
    
    //constructor that makes a copy of a port
    public Port(Port port){
        this.name = port.name;
        this.IO = port.IO;
        this.part=port.part;
    }
}
