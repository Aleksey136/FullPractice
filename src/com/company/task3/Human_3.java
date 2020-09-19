package com.company.task3;

public class Human_3 {
    public void human(){
        System.out.println("Происходит следующее: ");
        Head_3 head = new Head_3();
        head.hand.bend();
        head.hand.unbend();
        head.leg.bend();
        head.leg.unbend();
        head.think();
        head.nothink();
    }
}
