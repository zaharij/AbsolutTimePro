package com.company;

/**
 * Created by Zakhar on 20.01.2017.
 */
public abstract class WarMashine {

    private String color;
    private int speed;
    private int weight;
    private int coordinateX;
    private int coordinateY;
    private long coordinateTime;

    public WarMashine(String color, int speed, int weight, int coordinateX, int coordinateY) {
        this.color = color;
        this.speed = speed;
        this.weight = weight;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        setCoordinateTime();
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

    public long[] getCoordinates() {
        long[] coordinates = new long[]{coordinateX, coordinateY, coordinateTime};
        return coordinates;
    }

    public void moveMashine(int coordinateX, int coordinateY){
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
        setCoordinateTime();
    }

    private void setCoordinateTime() {
        this.coordinateTime = System.currentTimeMillis();
    }
}
