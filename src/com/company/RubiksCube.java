/*
 * Classname RubiksCube
 *
 * Version 1.0
 *
 * Copyright Skryp Andriy
 *
 */

package com.company;

import java.util.Objects;

public class RubiksCube extends Cube {

    // Parameters

    private int price;
    private int weight;
    private int numberOfSquaresOnOneSide;
    private int paintingPricePerSquare;
    private String colors;


    // Constructor WITH SUPER parameters

    public RubiksCube(int side, int price, int weight,
                      int numberOfSquaresOnOneSide, String colors) {
        super(side);
        this.price = price;
        this.weight = weight;
        this.numberOfSquaresOnOneSide = numberOfSquaresOnOneSide;
        this.colors = colors;
    }

    // Constructor WITHOUT SUPER parameters

    public RubiksCube(int price, int weight,
                      int numberOfSquaresOnOneSide, String colors) {
        this.price = price;
        this.weight = weight;
        this.numberOfSquaresOnOneSide = numberOfSquaresOnOneSide;
        this.colors = colors;
    }

    // EMPTY constructor

    public RubiksCube() {
    }


    // Getters Setters

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getNumberOfSquaresOnOneSide() {
        return numberOfSquaresOnOneSide;
    }

    public void setNumberOfSquaresOnOneSide(int numberOfSquaresOnOneSide) {
        this.numberOfSquaresOnOneSide = numberOfSquaresOnOneSide;
    }

    public int getPaintingPricePerSquare() {
        return paintingPricePerSquare;
    }

    public void setPaintingPricePerSquare(int paintingPricePerSquare) {
        this.paintingPricePerSquare = paintingPricePerSquare;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }


    // Method of calculating painting price of one side

    public int getPaintingPriceOfOneSide() {
        return this.getNumberOfSquaresOnOneSide() * this.getPaintingPricePerSquare();
    }

    // Method of calculating total painting price

    public int getTotalPaintingPrice(){
        return this.getPaintingPriceOfOneSide() * 6;
    }


    // toString() method

    @Override
    public String toString() {
        return "RubiksCube{" +
                "price=" + price +
                ", weight=" + weight +
                ", numberOfSquaresOnOneSide=" + numberOfSquaresOnOneSide +
                ", paintingPricePerSquare=" + paintingPricePerSquare +
                ", colors='" + colors + '\'' +
                '}';
    }

    // equals() and hashCode() methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RubiksCube that = (RubiksCube) o;
        return getPrice() == that.getPrice() &&
                getWeight() == that.getWeight() &&
                getNumberOfSquaresOnOneSide() == that.getNumberOfSquaresOnOneSide() &&
                getPaintingPricePerSquare() == that.getPaintingPricePerSquare() &&
                Objects.equals(getColors(), that.getColors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getPrice(), getWeight(),
                getNumberOfSquaresOnOneSide(), getPaintingPricePerSquare(), getColors());
    }
}