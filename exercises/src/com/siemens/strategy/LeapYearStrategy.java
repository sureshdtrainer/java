package com.siemens.strategy;

//OCP - Open Close Principle - open for extension and closed for modification
public interface LeapYearStrategy {
    boolean isLeapYear(int year);
}
