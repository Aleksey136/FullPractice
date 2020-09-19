package com.company.task4;

import java.util.Scanner;

public class Shape_4 {
    public void shape(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Какую фигуру вы хотите исследовать? (0 - окружность, 1 - прямоугольник, 2 - квадрат)");
        int number = scanner.nextInt();
        if (number==0){
            System.out.print("Введите радиус вашей окружности: ");
            double radius = scanner.nextDouble();
            Circle_4 circle = new Circle_4(radius);
            System.out.println("Площадь окружности равна: " + circle.outputArea());
            System.out.println("Периметр окружности равна: " + circle.outputPerimeter());
        }
        else if (number==1){
            System.out.print("Введите ширину вашего прямоугольника: ");
            double width = scanner.nextDouble();
            System.out.print("Введите высоту вашего прямоугольника: ");
            double height = scanner.nextDouble();
            Rectangle_4 rectangle = new Rectangle_4(width,height);
            System.out.println("Площадь прямоугольника равна: " + rectangle.outputArea());
            System.out.println("Периметр прямоугольника равна: " + rectangle.outputPerimeter());
        }
        else if (number==2){
            System.out.print("Введите размер стороны квадрата: ");
            double side = scanner.nextDouble();
            Square_4 square = new Square_4(side);
            System.out.println("Площадь квадрата равна: " + square.outputArea());
            System.out.println("Периметр квадрата равна: " + square.outputPerimeter());
        }
    }
}
