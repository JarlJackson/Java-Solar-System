package com.company;

import java.util.Random;

public class asteroidBelt extends systemObjects{

    planet[] mAstroid;
    point[] mPoint;

    int num_objects, minRangeDistance, maxRangeDistance, minAngle, maxAngle, minSize, maxSize;

    //Large constructor accessing the super class (System objects) and adding (max min) value

    public asteroidBelt(int num_objects, int minRangeDistance, int maxRangeDistance, int minAngle, int maxAngle, int minSize, int maxSize, String colour, double speed) {
        super(colour, speed);
        this.num_objects = num_objects;             //Number of asteroids
        this.minRangeDistance = minRangeDistance;   //Min distance of belt
        this.maxRangeDistance = maxRangeDistance;   //Max distance of belt
        this.maxAngle = maxAngle;                   //Max Starting angle
        this.minAngle = minAngle;                   //Min Starting angle
        this.minSize = minSize;                     //Min size of each asteroid
        this.maxSize = maxSize;                     //Max size of each asteroid

        mAstroid = new planet[num_objects];
        mPoint = new point[num_objects];

        for(int i =0; i<num_objects;i++){       //For loop to create an array of new points and planets
            mPoint[i] = new point(mRandomMethod(minRangeDistance,maxRangeDistance),mRandomMethod(minAngle,maxAngle));
            mAstroid[i] = new planet(mPoint[i],mRandomMethod(minSize,maxSize),colour,speed);
        }

    }

    public void draw(SolarSystem mainSystem){       //Draw method (Loops through array to draw each asteroid)
        for(int i=0; i<num_objects; i++){
            mAstroid[i].draw(mainSystem);
        }
    }

    public int mRandomMethod(int minValue, int maxValue){       //Random number generator method (Min max set later on)
        Random mR = new Random();
        int mRandom = mR.nextInt(maxValue -(minValue-1))+minValue;
        return mRandom;
    }
}
