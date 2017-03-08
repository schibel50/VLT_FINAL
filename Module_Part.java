package vlt;

/**
 * This class represents a part that is sitting as a placeholder for a module
 * called by another module
 * 
 * The name of the part is the name of the module
 * 
 * The array of Strings, portNames is the names of the ports associated with
 * the module
 * 
 * @author Parker
 */
public class Module_Part extends Part{
    
    public Module_Part(String name, String[] portNames){
        super(name);
        for(int i = 0; i < portNames.length; i++)
            ports.add(new Port(portNames[i], this));
    }
}
