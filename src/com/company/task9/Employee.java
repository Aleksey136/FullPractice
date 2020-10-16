package com.company.task9;

import java.util.Date;

public class Employee {
    private String surname;
    private String name;
    private Date date;
    private String place;
    private String phone;
    private double salary;
    private String position;
    public Employee(String name, String surname, Date date, String place, String phone, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.date = date;
        this.place = place;
        this.phone = phone;
        this.salary = salary;
        this.position = position;
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
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}
