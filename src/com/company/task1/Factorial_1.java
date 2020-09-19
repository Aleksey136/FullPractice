package com.company.task1;

public class Factorial_1 {
    public static void OutFactorial (int a){
        System.out.println("Введенное число: " + a);
        int i = a-1;
        if (i>=0) {
            while (i != 0) {
                a = a * i;
                i--;
            }
            System.out.println("Полученный факториал: " + a);
        }
        else
            System.out.println("Такого не может быть.");
    }
}
