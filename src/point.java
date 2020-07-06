package com.company;

public class point {

    private int distance;
    private double angle;

    public point (int distance, double angle){      //Point constructor for distance and angle
        this.distance = distance;
        this.angle = angle;
    }

    public int getDistance(){       //Distance getter method (returns Distance)
        return distance;
    }

    public double getAngle(){       //Angle getter method (returns Angle)
        return angle;
    }

    public void setAngle(double mAngle){        //Angle setter method
        this.angle = mAngle;
    }

}
