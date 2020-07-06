package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        SolarSystem mainSystem = new SolarSystem(750,750);

        ArrayList<planet> mainPlanets = new ArrayList<>(); //Creating an ArrayList of planets
        ArrayList<moon> mainMoons = new ArrayList<>();     //Creating an ArrayList of moons

        //Creating all the points for each planet and moon

        point pSun = new point(0,0);
        point pMercury = new point(55,10);
        point pVenus = new point(75,240);
        point pEarth = new point(100,30);
        point pEMoon = new point(10,90);
        point pMars = new point(120,125);
        point pSaturn = new point(160,0);
        point pJupiter = new point(210,200);
        point pJMoon1 = new point(21,110);
        point pJMoon2 = new point(26,220);
        point pJMoon3 = new point(32,175);
        point pJMoon4 = new point(38,190);
        point pUranus = new point(275,100);


        //Creating the planets (Specific values)

        sun sun = new sun(pSun,40,"ORANGE",0);
        planet Mercury = new planet(pMercury,4,"BROWN",5);
        planet Venus = new planet(pVenus, 5,"GREEN",3.2);
        planet Earth = new planet(pEarth,6,"BLUE",2.2);
        planet Mars = new planet(pMars,6,"RED",1.8);
        planet Saturn = new planet(pSaturn,10,"GREY",1.5);
        planet Jupiter = new planet(pJupiter,18,"BROWN",1.2);
        planet Uranus = new planet(pUranus,8,"CYAN",0.8);


        //Adding the planets to the ArrayList

        mainPlanets.add(Mercury);
        mainPlanets.add(Venus);
        mainPlanets.add(Earth);
        mainPlanets.add(Mars);
        mainPlanets.add(Saturn);
        mainPlanets.add(Jupiter);
        mainPlanets.add(Uranus);

        //Creating the moons (Specific values)

        moon EMoon = new moon(pEMoon, 2,"GREY",Earth,8);
        moon JMoon1 = new moon(pJMoon1, 1,"PINK",Jupiter,8);
        moon JMoon2 = new moon(pJMoon2, 2,"WHITE",Jupiter,4);
        moon JMoon3 = new moon(pJMoon3, 2,"GREY",Jupiter,5);
        moon JMoon4 = new moon(pJMoon4, 3,"RED",Jupiter,3);

        //Adding the moons to the ArrayList

        mainMoons.add(EMoon);
        mainMoons.add(JMoon1);
        mainMoons.add(JMoon2);
        mainMoons.add(JMoon3);
        mainMoons.add(JMoon4);

        //Creating Asteroid belts (Specific Values)

        asteroidBelt mBelt = new asteroidBelt(1000,290,330,0,360,1,3,"GREY",0.2);
        asteroidBelt mSunBelt = new asteroidBelt(250,132,142,0,360,1,2,"GREY",0.2);

        while (true){               //Drawing all objects onto the screen
            sun.draw(mainSystem);

            mBelt.draw(mainSystem);
            mSunBelt.draw(mainSystem);

            for(moon x: mainMoons){
                x.draw(mainSystem);
            }

            for(planet d: mainPlanets) {
                d.draw(mainSystem);
            }

            mainSystem.finishedDrawing();
        }
    }
}
