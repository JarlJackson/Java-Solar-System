package com.company;

public class systemObjects{

    point p;
    public int size;
    public String colour;
    public double speed;

    public systemObjects(point p, int size, String colour, double speed) {      //System object constructor
        this.p = p;                                                             //Adding size, colour and speed
        this.size = size;                                                       //Will be the super class constructor
        this.colour = colour;
        this.speed = speed;
    }

    public systemObjects(String colour, double speed) {     //Secondary constructor (Used if all parameters aren't set)
        this.colour = colour;
        this.speed = speed;
    }


}
