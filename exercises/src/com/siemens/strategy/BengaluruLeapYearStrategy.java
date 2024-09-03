package com.siemens.strategy;

public class BengaluruLeapYearStrategy implements LeapYearStrategy {

    @Override
    public boolean isLeapYear(int year) {
        System.out.println("Bengaluru LeapYear calculation");
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
     }

}
