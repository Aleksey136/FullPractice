package com.company.Main1to6;
import com.company.task1.Factorial_1;
import com.company.task1.RandomArr_1;
import com.company.task1.Summator_1;
import com.company.task2.Kennel_2;
import com.company.task2.ShapeTest_2;
import com.company.task3.BookTest_3;
import com.company.task3.Circle_3;
import com.company.task3.Human_3;
import com.company.task4to6.MovableRectangle_6;
import com.company.task4to6.Shape_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую практику вы хотите проверить?");
        int Practice = scanner.nextInt();
        if (Practice==1){
            System.out.println("Какой номер работы вы хотите проверить?");
            int numberwork = scanner.nextInt();
            if (numberwork==1) {
                int[] M = {1, 3, 5, 6, 8, 7, 5, 3, 2, 1};
                System.out.println("Наш цикл: [1,3,5,6,8,7,5,3,2,1].");
                System.out.println("Какой цикл вы хотите использовать? (For - 1, While - 2, Do While - 3.)");
                int cycle = scanner.nextInt();
                if (cycle == 1) {
                    Summator_1.cycleFor(M);
                }
                else if (cycle == 2) {
                    Summator_1.cycleWhile(M);
                }
                else if (cycle == 3) {
                    Summator_1.cycleDo(M);
                }
            }
            else if (numberwork==2) {
                for (String str : args) {
                    System.out.println("Аргумент = " + str + ";");
            }
            }
            else if (numberwork==3) {
                double a =1;
                for (int i = 1; i < 11; i++) {
                    System.out.format("%f;\n", a/i);
                }
            }
            else if (numberwork==4) {
                RandomArr_1.OutputArr();
            }
            else if (numberwork==5) {
                System.out.print("Введите число: ");
                int a = scanner.nextInt();
                System.out.println();
                Factorial_1.OutFactorial(a);
            }
        }
        else if (Practice==2){
            System.out.println("Какой номер работы вы хотите проверить?");
            int numberwork = scanner.nextInt();
            if (numberwork==1) {
                ShapeTest_2.ShapeTest();
            }
            else if (numberwork==2) {
                Kennel_2 kennel_2 = new Kennel_2();
                kennel_2.addingDog();
            }
        }
        else if (Practice==3) {
            System.out.println("Какой номер работы вы хотите проверить?");
            int numberwork = scanner.nextInt();
            if (numberwork==1) {
                Circle_3.CircleStart();
            }
            else if (numberwork==2){
                Human_3 human = new Human_3();
                human.human();
            }
            else if (numberwork==3){
                BookTest_3.main(args);
            }
        }
        else if (Practice==4){
            System.out.println("Данная реализация отвечает сразу за 4,5,6 практические работы.");
            System.out.println("Если хотите проверку 4-5 практической нажмите 0, если 6 - 1.");
            int number = scanner.nextInt();
            if (number==0) {
                Shape_4 shape = new Shape_4();
                shape.shape();
            }
            else {
                MovableRectangle_6 movableRectangle6 = new MovableRectangle_6();
                movableRectangle6.MovableRectangle();
            }
        }
    }
}
