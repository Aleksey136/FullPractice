package com.company.task7;

import com.sun.tools.javac.Main;

import java.util.List;

public class Company {
    double baseSalaryManager = 100_000;                                      //Можно менять фикс. оклад
    double baseSalaryTopManager = 130_000;
    double baseSalaryOperator = 70_000;
    double income = Math.floor(Math.random()*500_000);
    public void hire (String surname, String name, String position, Employee human){
        if (position == "Manager"){
            human.setSurname(surname);
            human.setName(name);
            human.setBaseSalary(baseSalaryManager);
            human.setPosition(new Manager().getJobTitle());
        }
        else if (position == "Top Manager"){
            human.setSurname(surname);
            human.setName(name);
            human.setBaseSalary(baseSalaryTopManager);
            human.setPosition(new TopManager().getJobTitle());
        }
        else if (position == "Operator"){
            human.setSurname(surname);
            human.setName(name);
            human.setBaseSalary(baseSalaryOperator);
            human.setPosition(new Operator().getJobTitle());
        }
        System.out.println("1 сотрудник нанят.");
    }
    public void hireAll(String position, int area, List<Employee> employees) {
        int j = employees.size();
        for (int i = employees.size(); i < area+j; i++) {
            if (position == "Manager") {
                employees.add(i, new Employee("Am" + i,"Am" + i, baseSalaryManager, new Manager().getJobTitle()));
            }
            if (position == "Top Manager") {
                employees.add(i, new Employee("Atm" + i,"Atm" + i, baseSalaryTopManager, new TopManager().getJobTitle()));
            }
            if (position == "Operator") {
                employees.add(i, new Employee("Aop" + i,"Aop" + i, baseSalaryOperator, new Operator().getJobTitle()));
            }
        }
        System.out.println("Сотрудники в количестве: " + area + " наняты.");
    }
    public void fire(String name, List<Employee> employees){
        for(int i = 0; i < employees.size(); i++)
            if (name == employees.get(i).getName()){
                System.out.println(employees.get(i).getPosition() + " " + employees.get(i).getName() + " уволен.");
                employees.remove(i);
            }
    }
    public void fireAll(int area, List<Employee> employees) {
        for (int i = 0; i < area; i++) {
            employees.remove(i);
        }
        System.out.println("Первые " + area + " уволены.");
    }
    public void sortSalary(List<Employee> employees){
        for(int i=0; i < employees.size(); i++){
            for(int j=i; j < employees.size(); j++){
                if (employees.get(i).getPosition()=="Manager")
                    employees.get(i).setBaseSalary(new Manager().calcSalary(employees.get(i).getBaseSalary()));
                else if (employees.get(i).getPosition()=="Top Manager")
                    employees.get(i).setBaseSalary(new TopManager().calcSalary(employees.get(i).getBaseSalary()));
                else if (employees.get(i).getPosition()=="Operator")
                    employees.get(i).setBaseSalary(new Operator().calcSalary(employees.get(i).getBaseSalary()));
                if(employees.get(i).getBaseSalary() > employees.get(j).getBaseSalary()){
                    double c = employees.get(i).getBaseSalary();
                    employees.get(i).setBaseSalary(employees.get(j).getBaseSalary());
                    employees.get(j).setBaseSalary(c);
            }
            }
        }
        System.out.println("После сортировки наших сотрудников их фиксированная часть зарплаты заменилась на саму заработную плату.");
    }
    public List<Employee> getLowestSalaryStaff(List<Employee> employees, int count){
        if(employees.size()>count){
            for(int i=count; i<employees.size(); i++){
                employees.remove(i);
            }
        }
        else{
            System.out.println("Введенное <count> вышло за пределы допустимого.");
        }
        return employees;
    }
    public List<Employee> getTopSalaryStaff(List<Employee> employees, int count) {
        if (employees.size() > count) {
            for (int i = employees.size() - count; i > 0; i--) {
                employees.remove(i);
            }
        }
        else{
            System.out.println("Введенное <count> вышло за пределы допустимого.");
        }
        return employees;
    }
    public double getIncome(){
        return income;
    }
    public void outputList(List<Employee> employees){
        for(int i=0; i < employees.size(); i++){
            System.out.println(i + ". " + employees.get(i).getPosition() + " " + employees.get(i).getSurname() + " " +
                    employees.get(i).getName() + " " + employees.get(i).getBaseSalary() + ";");
        }
    }
}
