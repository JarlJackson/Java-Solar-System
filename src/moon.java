package com.company;

public class moon extends systemObjects {

    planet mainPlanet;
    public moon(point p, int size, String colour, planet mainPlanet, double speed) { //Constructor for moon getting inheritance values from
        super(p, size, colour,speed);                                                //The super class (System Objects)
        this.mainPlanet = mainPlanet;
    }

    public void draw(SolarSystem mainSystem){   //Draw method for the moons (Accesses Solar system class)
        double distance = p.getDistance();
        double angle = p.getAngle();
        mainSystem.drawSolarObjectAbout(distance,angle,size,colour,mainPlanet.p.getDistance(),mainPlanet.p.getAngle());
        p.setAngle(p.getAngle()+speed);
    }
}
