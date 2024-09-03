package com.siemens.util;


//SRP - Single Responsibility Principle a class should have one and only reason to change 
public class YearValidator {
    public static boolean isValidYear(int year){
        return year > 0;
    }
}
