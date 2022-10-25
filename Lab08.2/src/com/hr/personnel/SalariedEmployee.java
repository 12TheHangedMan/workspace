package com.hr.personnel;

import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        super(name, hireDate);
    }

    public String toString() {
        return "Hourly Employee name: " +
                SalariedEmployee.super.getName()+
                " Hire Date: " + SalariedEmployee.super.getHireDate() +
                " salary=" + salary;
    }
}
