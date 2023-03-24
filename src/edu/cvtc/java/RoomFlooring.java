package edu.cvtc.java;

/*
    Author: Sebestyen Bandoli
*/

public class RoomFlooring {
    private RoomDimension roomDimension;
    private double cost;

    public RoomFlooring(RoomDimension roomDimensions, double cost) {
        this.roomDimension = roomDimensions;
        this.cost = cost;
    }

    public double totalCost() {
        return cost * roomDimension.getArea();
    }

    public String toString() {
        return "total cost of flooring: $" + totalCost();
    }
}
