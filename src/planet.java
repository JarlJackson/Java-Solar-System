package com.company;

public class planet extends systemObjects {

    public planet(point p, int size, String colour, double speed) { //Constructor for planet getting inheritance values from
        super(p, size, colour,speed);                               //The super class (System objects)
    }

    public void draw(SolarSystem mainSystem){       //Draw method for the planets (Accessing Solar system class)
        double distance = p.getDistance();
        double angle = p.getAngle();
        mainSystem.drawSolarObject(distance,angle,size,colour);
        p.setAngle(p.getAngle()+speed);
    }
}
