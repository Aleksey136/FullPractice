package com.company.task9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        Company company = new Company();
        company.hireAll("Chief", 10, employees);
        company.hireAll("Subordinate", 10, employees);
        company.hireAll("Cleaner", 10, employees);
        company.outputList(employees);
        System.out.println("В данный момент наняты такие сотрудники.");
        company.hire(employees);
        company.fire(employees);
        HandleEmployees handleEmployees = new HandleEmployees();
        System.out.println("Введите номер человека в списке и его новую должность: (Строго через Enter)");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        System.out.print("");                                           //Для того, чтобы был ввод через Enter
        String position = scanner.next();
        handleEmployees.changePosition(position,employees,i);
        System.out.println("Новые данные человека, у которого вы изменили данные: ");
        company.outputOneList(employees, i);
        System.out.println("Введите должность, на которую будут направлены случайные люди: ");
        String position2 = scanner.next();
        handleEmployees.randomChangePosition.randomChangePosition(position2, employees);
        company.outputList(employees);
        System.out.println("То, что стало после наших действий.");
    }
}