package com.company;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.TimeZone;

public class Main {

    public static void main(String[] args) {
        ZonedDateTime nowU = ZonedDateTime.now(ZoneOffset.UTC);
        ZonedDateTime nowL = ZonedDateTime.now(ZoneOffset.systemDefault());

        TimeZone localTimezone = TimeZone.getDefault();
        System.out.println("Diff.Local-UTC(" + localTimezone.getID() + "):" + localTimezone.getRawOffset()  + " \n " + "now UTC : " + nowU + " \n " + "now Local : " + nowL);
    }
}
