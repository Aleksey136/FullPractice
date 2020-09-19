package com.company.task4;

public class Square_4 {
    private double side;
    public Square_4(double side) {
        this.side = side;
    }
    public double getSide(){ return side; }
    public void setSide(double side){
        this.side=side;
    }
    public double outputArea(){
        return side*side;
    }
    public double outputPerimeter(){
        return 4*side;
    }
}
