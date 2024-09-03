package com.siemens.strategy;

public class GregorianLeapYearStrategy implements LeapYearStrategy {

    @Override
    public boolean isLeapYear(int year) {
        System.out.println("GregorianLeapYear Strategy");
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
     }

}
