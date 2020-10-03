package com.company.task4to6;

public class Circle_4 {
    private double radius;
    public Circle_4(double radius) {
        this.radius = radius;
    }
    public double getRadius(){ return radius; }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double outputArea(){
        return Math.PI*radius*radius;
    }
    public double outputPerimeter(){
        return 2*Math.PI*radius;
    }
}
