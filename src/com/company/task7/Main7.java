package com.company.task7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args){
        List<Employee> employees = new ArrayList<Employee>();
        Company company = new Company();
        company.hireAll("Manager",80, employees);
        company.hireAll("Operator", 180, employees);
        company.hireAll("Top Manager", 10, employees);
        company.outputList(employees);
        System.out.println("В данный момент наняты такие сотрудники ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Увольте первых <n> человек, введите n: ");
        int number2 = scanner.nextInt();
        company.fireAll(number2,employees);
        company.outputList(employees);
        company.sortSalary(employees);
        System.out.println("Введите count для возрастания: ");
        int number3 = scanner.nextInt();
        company.outputList(company.getTopSalaryStaff(employees,number3));
        System.out.println("Введите count для убывания: ");
        int number4 = scanner.nextInt();
        company.outputList(company.getLowestSalaryStaff(employees,number4));
        employees.clear();
    }
}