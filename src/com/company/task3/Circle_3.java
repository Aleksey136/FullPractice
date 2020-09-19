package com.company.task3;

import java.util.Scanner;

public class Circle_3 {
    private String name;
    private double radius;
    public Circle_3(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRadius(){ return radius; }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public static void PropertyCircle(double radius){
        System.out.println("Длина окружности равна: " + 2*Math.PI*radius);
        System.out.println("Площадь окружности равна:" + Math.PI*radius*radius);
        System.out.println("Диаметр окружности равен:" + 2*radius);
    }
    public static void CircleStart() {
        Circle_3 circle = new Circle_3("circle", 8.54);
        System.out.println("Имя фигуры: " + circle.getName());
        System.out.println("Радиус: " + circle.getRadius());
        PropertyCircle(circle.radius);
        System.out.println("Хотите ли вы изменить радиус? (0 - Нет, 1 - Да)");
        Scanner scanner = new Scanner(System.in);
        int cycle = scanner.nextInt();
        while (cycle==1) {
            System.out.print("Введите новый радиус: ");
            double radius = scanner.nextDouble();
            PropertyCircle(radius);
            System.out.println("Хотите ли вы изменить радиус? (0 - Нет, 1 - Да)");
        }
    }
}
