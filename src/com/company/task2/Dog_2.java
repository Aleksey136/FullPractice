package com.company.task2;

public class Dog_2 {
    private String name;
    private double age;
    public Dog_2(String name, double age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getAge(){
        return age;
    }
    public void setAge(double age){
        this.age=age;
    }
    public static void translationAge(Dog_2 pet){
        System.out.println("Возраст собаки в человеческих годах: " + pet.getAge()*7);
    }
    public static void ToString(Dog_2 pet){
        System.out.println("Кличка данной собаки: " + pet.getName() + "; Возраст данной собаки: " + pet.getAge());
    }
}
