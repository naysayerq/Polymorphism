/*
 * Classname Cube
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package com.company;

import java.util.Objects;

public class Cube implements IGeometry, IPackaging{

    // Parameters

    private int side;

    // Constructors:

    // Constructor FULL

    public Cube(int side) {
        this.side = side;
    }

    // Constructor EMPTY

    public Cube() {
    }


    // Getters & Setters:

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }


    // Creating methods:

    // Volume

    public int getVolume() {
        return (this.getSide() * this.getSide() * this.getSide());
    }

    // Diagonal

    public double getDiagonal() {
        return (Math.sqrt(2) * this.getSide());
    }

    // Angle between faces of a cube

    public double getAngleBetweenFaces() {
        return (Math.PI / 2);
    }

    // Radius of the described sphere

    public double getRadiusOfTheDescribedSphere() {
        return ((Math.sqrt(3) / 2) * this.getSide());
    }




    // --------------------------- MODULE 2 TASK 3 - POLYMORPHISM ------------------------------




    // ---------- IGeometry methods ---------

    // Area

    @Override
    public double getArea() {
        return (6 * this.getSide() * this.getSide());
    }

    // Method of calculating the Linear Length

    @Override
    public double getLinearLength() {
        return 12 * this.getSide();
    }


    // ---------- IPackaging methods ---------

    // Method toString()

    public String toString() {
        return "Cube{" +
                "side=" + side +
                "area=" + getArea() +
                "volume=" + getVolume() +
                "diagonal=" + getDiagonal() +
                "angle between faces of a cube="
                + getAngleBetweenFaces() +
                "radius of the described sphere="
                + getRadiusOfTheDescribedSphere()
                + "}";
    }

    // Method toJSON()

    @Override
    public String toJSON() {
        String json = "Cube{"
                + "\"" + "side\":" + this.getSide()
                + ", \"" + "area\":" + this.getArea()
                + ", \"" + "volume\":" + this.getVolume()
                + ", \"" + "diagonal\":" + this.getDiagonal()
                + ", \"" + "angle between faces of a cube\":"
                + this.getAngleBetweenFaces()
                + ", \"" + "radius of the described sphere\":"
                + this.getRadiusOfTheDescribedSphere()
                + "}";
        return json;
    }

    // Method toXML()

    @Override
    public String toXML() {
        String xml = "<Cube>"
                + "<side>" + this.getSide() + "</side>"
                + "<area>" + this.getArea() + "</area>"
                + "<volume>" + this.getVolume() + "</volume>"
                + "<diagonal>" + this.getDiagonal() + "</diagonal>"
                + "<angle between faces of a cube>" + this.getAngleBetweenFaces()
                + "</angle between faces of a cube>"
                + "<radius of the described sphere>" + this.getRadiusOfTheDescribedSphere()
                + "</radius of the described sphere>"
                + "</Cube>";
        return xml;
    }

    // Method toConsole()

    @Override
    public String toConsole() {
        String consoleString = "Cube: " +
                "\nside = " + this.getSide() +
                "\narea = " + this.getArea() +
                "\nvolume = " + this.getVolume() +
                "\ndiagonal = " + this.getDiagonal() +
                "\nangle between faces of a cube = " + this.getAngleBetweenFaces() +
                "\nradius of the described sphere = " + this.getRadiusOfTheDescribedSphere();
        return consoleString;
    }



    // hash() and equals() methods:

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cube cube = (Cube) o;
        return getSide() == cube.getSide();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSide());
    }

}