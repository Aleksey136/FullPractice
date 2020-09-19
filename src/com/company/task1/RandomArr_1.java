package com.company.task1;

import java.util.Random;

public class RandomArr_1 {
    public static void OutputArr ()
    {
        int[] MyArr = new int[10];
        System.out.println("Наш случайный массив при генерации методом Random():");
        Random r = new Random();
        for (int i = 0; i < MyArr.length; i++){
            MyArr[i]= r.nextInt(10);
            System.out.print(MyArr[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Наш отсортированный массив при генерации методом Random():");
        for (int i = MyArr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(MyArr[j] > MyArr[j + 1]) {
                    MyArr[j] = MyArr[j] + MyArr[j + 1];
                    MyArr[j + 1] = MyArr[j] - MyArr[j + 1];
                    MyArr[j] = MyArr[j] - MyArr[j + 1];
                }
            }
        }
        for (int i = 0; i < MyArr.length; i++){
            System.out.print(MyArr[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Наш случайный массив при генерации методом Math.random():");
        for (int i = 0; i < MyArr.length; i++){
            MyArr[i]= (int) (Math.random()*10);
            System.out.print(MyArr[i] + " ");
        }
        System.out.print("\n");
        System.out.println("Наш отсортированный массив при генерации методом Math.random():");
        for (int i = MyArr.length - 1; i > 0; i--){
            for (int j = 0; j < i; j++){
                if(MyArr[j] > MyArr[j + 1]) {
                    MyArr[j] = MyArr[j] + MyArr[j + 1];
                    MyArr[j + 1] = MyArr[j] - MyArr[j + 1];
                    MyArr[j] = MyArr[j] - MyArr[j + 1];
                }
            }
        }
        for (int i = 0; i < MyArr.length; i++){
            System.out.print(MyArr[i] + " ");
        }
    }
}