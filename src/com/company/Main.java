package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

	// write your code here
    // Normal single line comment

    /*
       Multiple lines comments
    */

        int hour = 11;
        int minute = 59;
        System.out.print("The current time is ");
        System.out.print(hour);
        System.out.print(":");
        System.out.print(minute);
        System.out.println(".");

        String day = "sunday ";
        String date = "5 th ";
        String month = "sep ";
        String year = "2021";
        System.out.println("American format:");
        System.out.print(date);
        System.out.print(day);
        System.out.print(month);
        System.out.println(year);

        System.out.println("European format:");
        System.out.print(day);
        System.out.print(date);
        System.out.print(month);
        System.out.println(year);
        System.out.println(day+date+month+year);
        System.out.println("Made whit a different print style!");

        int second = 23;

        System.out.print("Seconds since midnight: ");
        System.out.println(hour * 60 * 60 + minute * 60 + second);

        System.out.print("Seconds left of the day: ");
        System.out.println(24 * 60 * 60 - hour * 60 * 60 - minute * 60 - second);
    }
}