/*
 * Classname Main
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 * Polymorphism.
 *
 * Create and implement  two interfaces for your class.
 *
 */

package com.company;

public class Main {

    public static void main(String[] args) {


        // TESTING

        // Creating object of Rectangle

        Rectangle myRectangle = new Rectangle(3, 4);
        System.out.println(myRectangle.toJSON() + "\n");

        // Creating object of Computer Monitor

        ComputerMonitor SE2719HR = new ComputerMonitor("black", "Dell",
                75, 1920, 1080,
                16, 9);

        System.out.println(SE2719HR.toString() + "\n");

        // Creating object of Cube

        Cube myCube = new Cube (4);
        System.out.println(myCube.toConsole() + "\n");;

        // Creating object of Rubiks Cube

        RubiksCube myRubiksCube = new RubiksCube(50, 80, 9, "r b y g w o");
        System.out.println(myRubiksCube.toString());


    }
}

