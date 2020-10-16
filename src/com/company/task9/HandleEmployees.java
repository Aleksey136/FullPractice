package com.company.task9;

public class HandleEmployees{
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
}
GetSalary getSalary = new GetSalary(){
    @Override
    public void
};
