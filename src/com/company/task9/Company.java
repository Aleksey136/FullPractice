package com.company.task9;

import java.util.*;

public class Company {
    public void hire (List<Employee> employees){
        int number = employees.size();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавьте нового сотрудника. Введите имя и должность сотрудника: ");
        String name = scanner.nextLine();
        String position = scanner.nextLine();
        Employee employee = new Employee(name,"UserPlus", new GregorianCalendar(2002,0,1),
                "UserStreet","80000000000", new HandleEmployees().getSalaryOfPosition(position),position);
        employees.add(employee);
        System.out.println("1 сотрудник нанят со следующими данными.");
        outputOneList(employees,number);
    }
    public void hireAll(String position, int area, List<Employee> employees) {
        int j = employees.size();
        for (int i = employees.size(); i < area+j; i++) {
            employees.add(i, new Employee("User" + i, "User" + i, new GregorianCalendar(2002,0,1),
                    "UserStreet","80000000000", new HandleEmployees().getSalaryOfPosition(position),position));
        }
        System.out.println("Сотрудники в количестве: " + area + " наняты.");
    }
    public void fire(List<Employee> employees){
        System.out.println("Введите номер человека в списке, которого хотите уволить: ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.println("Человек у которого следующие данные уволен: ");
        outputOneList(employees,i);
        employees.remove(i);
    }
    public void outputList(List<Employee> employees){
        for(int i=0; i < employees.size(); i++){
            outputOneList(employees, i);
        }
    }
    public void outputOneList(List<Employee> employees, int i){
        System.out.println(i + ". " + employees.get(i).getName() + " " + employees.get(i).getSurname() + " " +
                employees.get(i).getDate().getTime() + " " + employees.get(i).getPlace() + " " + employees.get(i).getPhone() + " " +
                employees.get(i).getSalary() + " " + employees.get(i).getPosition() + ";");
    }
}