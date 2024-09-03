package com.siemens.data;

import com.siemens.strategy.LeapYearStrategy;

public class Year {

    protected int year;
    private LeapYearStrategy leapYearStrategy;

    public Year(int year, LeapYearStrategy leapYearStrategy){
        this.year = year;
        this.leapYearStrategy= leapYearStrategy;
    }

    public int getYear(){
        return this.year;
    }

    public boolean isLeapYear(){
        return leapYearStrategy.isLeapYear(year);
    }
}
