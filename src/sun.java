package com.company;

public class sun extends systemObjects {

    public sun(point p, int size, String colour, double speed) {    //Constructor for sun getting inheritance values from
        super(p, size, colour,speed);                               //The super class (System Objects)
    }

    public void draw(SolarSystem mainSystem){       //Draw method for the sun (Accessing solar system class)
        double distance = p.getDistance();
        double angle = p.getAngle();
        mainSystem.drawSolarObject(distance,angle,40,"YELLOW");
    }
}