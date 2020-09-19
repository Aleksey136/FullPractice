package com.company.task2;

public class Shape_2 {
    private String name;
    private int sides;
    private double line;
    public Shape_2(String name, int sides, double line) {
        this.name = name;
        this.sides = sides;
        this.line = line;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSides(){
        return sides;
    }
    public void setSides(int sides){
        this.sides=sides;
    }
    public double getLine(){
        return line;
    }
    public void setLine(double line){
        this.line=line;
    }
}