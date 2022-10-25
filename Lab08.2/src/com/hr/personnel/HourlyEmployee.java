package com.hr.personnel;

import java.time.LocalDate;

public class HourlyEmployee extends Employee {

    private double rate;

    private double hours;

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        super(name, hireDate);
        this.rate = rate;
        this.hours = hours;
    }

    public String toString() {
        return "Hourly Employee name: " + HourlyEmployee.super.getName()+
                " Hire Date: " + HourlyEmployee.super.getHireDate() +
                " rate=" + rate +
                " hours=" + hours;
    }
}
