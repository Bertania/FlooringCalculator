package edu.cvtc.java;

/*
    Author: Sebestyen Bandoli
*/

public class RoomDimension {
    // Attributes
    private double length;
    private double width;

    // Default Constructor
    public RoomDimension(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Methods
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public RoomDimension(RoomDimension roomDimension) {

    }

    public double getArea() {
        return length * width;
    }

}
