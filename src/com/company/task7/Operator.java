package com.company.task7;

public class Operator implements EmployeePosition{
    @Override
    public String getJobTitle() {
        return "Operator";
    }
    @Override
    public double calcSalary(double baseSalary) {
        return baseSalary;
    }
}
