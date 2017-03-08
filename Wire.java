package vlt;

import java.util.ArrayList;

/**
 * This class represents the attributes of a wire
 * 
 * @author Ryan
 */
public class Wire {
    String name;
    ArrayList<Port> ports;
    int size;
    
    //creates the wire with a name and size
    public Wire(String name,int size){
        this.name = name;
        this.size = size;
        ports = new ArrayList<>();
    }
    
    //creates a copy of an already existing wire
    public Wire(Wire wire){
        this.name = wire.name;
        this.size = wire.size;
        this.ports = new ArrayList<>();
        for(Port port : wire.ports){
            Port temp = new Port(port);
            Part tempP;
            if(port.part!=null)
                tempP = new Part(port.part);
            else
                tempP=null;
            temp.part=tempP;
            this.ports.add(temp);
        }
    }
    
    //add a port the wire is connected to
    public void addPort(Port port){
        ports.add(port);
    }
    
    //creates a copy of a wire
    public void copy(Wire wire){
        this.name=wire.name;
        this.size=wire.size;
        for(Port port : wire.ports){
            this.ports.add(port);
        }
    }
}