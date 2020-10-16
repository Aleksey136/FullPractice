package com.company.task9;

public class Main9 {
    public static void main(String[] args) {
        HandleEmployees handleEmployees = new HandleEmployees();
        GetSalaryOfPosition SalaryOfPos = (position) -> {
            double i = 0;
            if (position.equals("Chief")){
                i = 100000;
            }
            else if (position.equals("Subordinate")){
                i = 50000;
            }
            else if(position.equals("Сleaner")) {
                i = 30000;
            }
            return i;
        };
        System.out.println(SalaryOfPos.getSalaryOfPosition("Chief"));
    }
}
