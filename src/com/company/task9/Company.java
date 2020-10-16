package com.company.task9;

import java.util.Date;
import java.util.List;

public class Company {
    public void hire (String name, Date date, double salary, List<Employee> employees){
        Employee employee = new Employee(name,"UserPlus",date,"UserStreet","80000000000",salary,"");
        employees.add(employee);
        System.out.println("1 сотрудник нанят.");
    }
    public void fire(int i, List<Employee> employees){
        System.out.println(employees.get(i).getName() + " " + employees.get(i).getDate() + " уволен.");
        employees.remove(i);
    }
}