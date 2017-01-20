package com.company;

public class Main {

    public static void main(String[] args) {

        WarMashine tank = new Tank("green", 36000, 50000, 15, 20, 300);
        WarMashine plane = new Plane("white", 1000000, 30000, 30, 45, 13000);
        System.out.println(tank.getColor() + " | " +  plane.getColor());

        System.out.println( "x = " + tank.getCoordinates()[0] + "\n" + "y = " + tank.getCoordinates()[1]
                + "\n" + "time = " + tank.getCoordinates()[2]);
    }
}
