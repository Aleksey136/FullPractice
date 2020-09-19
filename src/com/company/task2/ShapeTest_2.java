package com.company.task2;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ShapeTest_2 {
    public static void ShapeTest(){
        Shape_2 shape = new Shape_2("pentagon",5,8.54);
        System.out.println("Имя фигуры: " + shape.getName());
        System.out.println("Кол-во сторон фигуры: " + shape.getSides());
        System.out.println("Каждая сторона равна: " + shape.getLine());
        shape.setSides(4);
        shape.setName("quadrangle");
        System.out.println("\nНовое имя фигуры: " + shape.getName());
        System.out.println("Новое значение количества сторон: " + shape.getSides());
        System.out.print("Введите новое значение каждой стороны фигуры: ");
        Scanner scanner = new Scanner(System.in);
        double newline = scanner.nextDouble();
        shape.setLine(newline);
        System.out.println("\nНовое значение каждой стороны равно: " + shape.getLine());
    }
}
