/*
 * Classname ComputerMonitor
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package com.company;

public class ComputerMonitor extends Rectangle{

    // Parameters

    private String color;
    private String brand;
    private int refreshRate;
    private int resolutionLength;
    private int resolutionWidth;
    private int aspectRatioLength;
    private int aspectRatioWidth;

    // Constructor WITH SUPER parameters

    public ComputerMonitor(int length, int width, String color,
                           String brand, int refreshRate,
                           int resolutionLength, int resolutionWidth,
                           int aspectRatioLength, int aspectRatioWidth) {
        super(length, width);
        this.color = color;
        this.brand = brand;
        this.refreshRate = refreshRate;
        this.resolutionLength = resolutionLength;
        this.resolutionWidth = resolutionWidth;
        this.aspectRatioLength = aspectRatioLength;
        this.aspectRatioWidth = aspectRatioWidth;
    }

    // Constructor WITHOUT SUPER parameters

    public ComputerMonitor(String color, String brand, int refreshRate,
                           int resolutionLength, int resolutionWidth,
                           int aspectRatioLength, int aspectRatioWidth) {
        this.color = color;
        this.brand = brand;
        this.refreshRate = refreshRate;
        this.resolutionLength = resolutionLength;
        this.resolutionWidth = resolutionWidth;
        this.aspectRatioLength = aspectRatioLength;
        this.aspectRatioWidth = aspectRatioWidth;
    }

    // EMPTY constructor

    public ComputerMonitor() {
    }

    // Getters Setters

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }

    public int getResolutionLength() {
        return resolutionLength;
    }

    public void setResolutionLength(int resolutionLength) {
        this.resolutionLength = resolutionLength;
    }

    public int getResolutionWidth() {
        return resolutionWidth;
    }

    public void setResolutionWidth(int resolutionWidth) {
        this.resolutionWidth = resolutionWidth;
    }

    public int getAspectRatioLength() {
        return aspectRatioLength;
    }

    public void setAspectRatioLength(int aspectRatioLength) {
        this.aspectRatioLength = aspectRatioLength;
    }

    public int getAspectRatioWidth() {
        return aspectRatioWidth;
    }

    public void setAspectRatioWidth(int aspectRatioWidth) {
        this.aspectRatioWidth = aspectRatioWidth;
    }

    // Method of calculating total pixels

    public int getTotalPixels(){
        return this.getResolutionLength() * this.getResolutionWidth();
    }

    // toString() method

    @Override
    public String toString() {
        return "ComputerMonitor{" +
                "length='" + super.getLength() + '\'' +
                "width='" + super.getWidth() + '\'' +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", refreshRate=" + refreshRate +
                ", resolutionLength=" + resolutionLength +
                ", resolutionWidth=" + resolutionWidth +
                ", aspectRatioLength=" + aspectRatioLength +
                ", aspectRatioWidth=" + aspectRatioWidth +
                '}';
    }
}
