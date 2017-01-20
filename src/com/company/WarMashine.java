package com.company;

/**
 * Created by Zakhar on 20.01.2017.
 */
public abstract class WarMashine {

    private String color;
    private int speed;
    private int weight;

    public WarMashine(String color, int speed, int weight) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
