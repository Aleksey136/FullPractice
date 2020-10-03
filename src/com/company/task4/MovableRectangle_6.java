package com.company.task4;

import java.util.Scanner;

public class MovableRectangle_6 implements Movable {
    private double x1,y1,x2,y2;
    private double speed1, speed2;
    public void MovableRectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Каким способом вы хотите задать прямоугольник? (0 - через ширину и высоту, 1 - через точки в пространстве)");
        int number = scanner.nextInt();
        if (number == 0) {
            System.out.print("Введите ширину вашего прямоугольника: ");
            double width = scanner.nextDouble();
            System.out.print("Введите высоту вашего прямоугольника: ");
            double height = scanner.nextDouble();
            setPoint(0,0,width,height);
            System.out.println("Введите скорость перемещения: ");
            double speed = scanner.nextDouble();
            outputNewPoint(x1,y1,x2,y2,speed,speed);
            speedCheckPoint(speed,speed);
        }
        else if (number==1){
            System.out.println("Введите левую верхнюю точку (x,y): ");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();
            System.out.println("Введите правую нижнюю точку (x,y): ");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();
            setPoint(x1,y1,x2,y2);
            System.out.println("Введите 1 скорость перемещения: ");
            double speed1 = scanner.nextDouble();
            System.out.println("Введите 2 скорость перемещения: ");
            double speed2 = scanner.nextDouble();
            setSpeedPoint(speed1,speed2);
            outputNewPoint(x1,y1,x2,y2,speed1,speed2);
            speedCheckPoint(speed1,speed2);
        }
    }

    @Override
    public void speedCheckPoint(double speed1, double speed2) {
        if (speed1==speed2){
            System.out.println("Скорости одинаковые.");
        }
        else {
            System.out.println("Скорости не одинаковые.");
        }
    }

    @Override
    public void setPoint(double x1, double y1, double x2, double y2) {
        this.x1=x1;
        this.x2=x2;
        this.y1=y1;
        this.y2=y2;
    }

    @Override
    public void setSpeedPoint(double speed1, double speed2) {
        this.speed1=speed1;
        this.speed2=speed2;
    }

    @Override
    public void outputNewPoint(double x1, double y1, double x2, double y2, double speed1, double speed2) {
        System.out.println("Новая координата левой верхней точки: (" + (x1 + speed1) + ", " + (y1 + speed1) + ").");
        System.out.println("Новая координата правой нижней точки: (" + (x2 + speed2) + ", " + (y2 + speed2) + ").");
    }
}
