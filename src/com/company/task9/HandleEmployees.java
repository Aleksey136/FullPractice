package com.company.task9;

import java.util.List;
import java.util.Random;

public class HandleEmployees implements GetSalaryOfPosition, ChangePosition{
    @Override
    public double getSalaryOfPosition(String position) {
        GetSalaryOfPosition SalaryOfPos = (position2) -> {
            double i = 0;
            if (position2.equals("Chief")) {
                i = 100000;
            } else if (position2.equals("Subordinate")) {
                i = 50000;
            } else if (position2.equals("Cleaner")) {
                i = 30000;
            }
            return i;
        };
        return SalaryOfPos.getSalaryOfPosition(position);
    }

    @Override
    public void changePosition(String position, List<Employee> employee, int number) {
        System.out.println("Вы решили изменить профессию человека на позиции " + number + " на " + position + ";");
        employee.get(number).setPosition(position);
        employee.get(number).setSalary(getSalaryOfPosition(position));
    }
    RandomChangePosition randomChangePosition = new RandomChangePosition() {
        @Override
        public void randomChangePosition(String position, List<Employee> employee) {
            Random random = new Random();
            int b1 = random.nextInt(employee.size());
            int b2 = random.nextInt(employee.size());
            if (b1 > b2) {
                int b3 = b2;
                b2 = b1;
                b1 = b3;
            }
            System.out.println("Вы изменяете профессию " + (b2 - b1) + " человек. С позиции " + b1 + " до " + b2 + ". ");
            for (int i = b1; i <= b2; i++) {
                changePosition(position, employee, i);
            }
        }
    };
}