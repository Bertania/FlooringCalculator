package edu.cvtc.java;

/*
    Author: Sebestyen Bandoli
*/

import java.util.Scanner;

public class FlooringCalculatorProgram {

    public static void main(String[] args) {

        // Create a Scanner object for keyboard input
        Scanner keyboard = new Scanner(System.in);

        // Get the length of the room
        System.out.println("Enter your room's length: ");
        double length = keyboard.nextDouble();

        // Get the width of the room
        System.out.println("Enter your room's width: ");
        double width = keyboard.nextDouble();

        System.out.println("Enter your desired cost of flooring per square inch: ");
        double cost = keyboard.nextDouble();

        keyboard.close();

        // Convert the length and width to the total cost for the flooring
        RoomDimension dimension = new RoomDimension(length, width);
        RoomFlooring roomFlooring = new RoomFlooring(dimension, cost);

        // Display the total for the flooring
        System.out.println(roomFlooring);

    }
}
