package com.company.task4to6;

public class Rectangle_4 {
    private double width;
    private double height;
    public Rectangle_4(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getWidth(){ return width; }
    public void setWidth(double width){
        this.width=width;
    }
    public double getHeight(){ return height; }
    public void setHeight(double height) { this.height=height; }
    public double outputArea(){
        return width*height;
    }
    public double outputPerimeter(){
        return 2*(width+height);
    }
}
