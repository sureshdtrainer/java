package com.siemens.data;

import com.siemens.strategy.LeapYearStrategy;
import com.siemens.util.YearValidator;

public class ValidatedYear extends Year {

    public ValidatedYear(int year, LeapYearStrategy leapYearStrategy) {
        super(year, leapYearStrategy);
    }

    @Override
    public boolean isLeapYear() {
        if (!YearValidator.isValidYear(year)) {
            System.out.println("Invalid year: " + year + ". Year must be postive number.");
            return false;
        }
        return super.isLeapYear();
    }
}
