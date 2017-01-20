package com.company;

/**
 * Created by Zakhar on 20.01.2017.
 */
public class Tank extends WarMashine {

    private int barrelRadius;

    public Tank(String color, int speed, int weight, int barrelRadius) {
        super(color, speed, weight);
        this.barrelRadius = barrelRadius;
    }

    public int getBarrelRadius() {
        return barrelRadius;
    }

    public void setBarrelRadius(int barrelRadius) {
        this.barrelRadius = barrelRadius;
    }
}
