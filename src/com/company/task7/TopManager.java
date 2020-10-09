package com.company.task7;

public class TopManager implements EmployeePosition{
    @Override
    public String getJobTitle(){
        return ("Top Manager");
    }
    @Override
    public double calcSalary(double baseSalary) {
        Company company = new Company();
        if (company.getIncome()<10_000_000){
            return baseSalary;
        }
        else {
            return 2.5*baseSalary;
        }
    }
}
