/*
 * Classname Rectangle
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package com.company;

import java.util.Objects;

public class Rectangle implements IGeometry, IPackaging{

    // Parameters

    private int length;
    private int width;

    // Constructor FULL

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Constructor EMPTY

    public Rectangle() {
    }

    // Getters Setters

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }



    // Method which determines a Quadrate

    public boolean isQuadrate(){
        return ((this.length == this.width) ? true : false);
    }



    // --------------------------- MODULE 2 TASK 3 - POLYMORPHISM ------------------------------




    // ---------- IGeometry methods ---------

    // Method of calculating the Area

    @Override
    public double getArea() {
        return this.getLength() * this.getWidth();
    }

    // Method of calculating the Linear Length

    @Override
    public double getLinearLength() {
        return 2 * (this.getLength() + this.getWidth());
    }


    // ---------- IPackaging methods ---------

    // Method toString()

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + getArea() +
                ", isQuadrate=" + isQuadrate() +
                '}';
    }

    // Method toJSON()

    @Override
    public String toJSON() {
        String json = "Rectangle{"
                + "\"" + "length\":" + this.getLength()
                + ", \"" + "width\":" + this.getWidth()
                + ", \"" + "area\":" + this.getArea()
                + ", \"" + "isQuadrate\":" + this.isQuadrate()
                + "}";
        return json;

    }

    // Method toXML()

    @Override
    public String toXML() {
        String xml = "<Rectangle>"
                + "<length>" + this.getLength() + "</length>"
                + "<width>" + this.getWidth() + "</width>"
                + "<area>" + this.getArea() + "</area>"
                + "<isQuadrate>" + this.isQuadrate() + "</isQuadrate>"
                + "</Rectangle>";
        return xml;
    }

    // Method toConsole()

    @Override
    public String toConsole() {
        String consoleString = "Rectangle: " +
                "\nlength = " + this.getLength() +
                "\nwidth = " + this.getWidth() +
                "\narea = " + this.getArea() +
                "\nisQuadrate = " + this.isQuadrate();
        return consoleString;
    }



    // Methods equals() and hashCode()

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return getLength() == rectangle.getLength() &&
                getWidth() == rectangle.getWidth();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLength(), getWidth());
    }

}
