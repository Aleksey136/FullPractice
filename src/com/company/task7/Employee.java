package com.company.task7;

public class Employee {
    private String surname;
    private String name;
    private double baseSalary;
    public Employee(String surname, String name, double baseSalary) {
        this.surname = surname;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

