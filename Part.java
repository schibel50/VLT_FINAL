/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vlt;

import java.util.ArrayList;

/**
 * This class is the parent class of all parts. It has a name, a list of ports 
 * attached to it and an active Low boolean
 * 
 * @author Ryan
 */
public class Part {
    
    String name;
    ArrayList<Port> ports;
    boolean activeLow;
    
    //constructor
    public Part(String name){
        this.name=name;
        ports = new ArrayList<>();
        activeLow = false;
    }
    
    //replaces a part with another part
    public Part(Part part){
        this.name=part.name;
        this.ports=part.ports;
        this.activeLow=part.activeLow;
    }
    
    //a copy constructor
    public void copy(Part part){
        this.name = part.name;
        for(int i = 0; i < part.ports.size(); i++)
            this.ports.add(part.ports.get(i));
        this.activeLow = part.activeLow;
    }
}
