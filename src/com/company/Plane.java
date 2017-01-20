package com.company;

/**
 * Created by Zakhar on 20.01.2017.
 */
public class Plane extends WarMashine{

    private int maxHeighth;

    public Plane(String color, int speed, int weight, int coordinateX, int coordinateY, int maxHeighth) {
        super(color, speed, weight, coordinateX, coordinateY);

        this.maxHeighth = maxHeighth;
    }

    public int getMaxHeighth() {
        return maxHeighth;
    }

    public void setMaxHeighth(int maxHeighth) {
        this.maxHeighth = maxHeighth;
    }
}
