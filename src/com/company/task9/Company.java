package com.company.task9;

import java.util.Date;
import java.util.List;

public class Company {
    public void hire (int number, String name, Date date, double salary, List<Employee> employees){
        employees.get(number).setName(name);
        employees.get(number).setDate(date);
        employees.get(number).setSalary(salary);
        employees.get(number).setSurname("UserPlus");
        employees.get(number).setPhone("80000000000");
        employees.get(number).setPlace("UserStreet");
        System.out.println("1 сотрудник нанят.");
    }
    public void fire(int i, List<Employee> employees){
        System.out.println(employees.get(i).getName() + " " + employees.get(i).getDate() + " уволен.");
        employees.remove(i);
    }
}