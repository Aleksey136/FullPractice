package com.company.task2;

import java.util.Scanner;

public class Kennel_2 {
    Scanner scanner = new Scanner(System.in);
    public Dog_2[] ArrayOfDog = new Dog_2[3];
    public Kennel_2() {
        ArrayOfDog[0] = new Dog_2("Night Magic", 8.3);
        ArrayOfDog[1] = new Dog_2("Baby Love", 5.8);
        ArrayOfDog[2] = new Dog_2("North Star", 9.2);
    }
    public void addingDog(){
        System.out.print("Сколько собак вы хотите добавить в питомник: ");
        int quantity = scanner.nextInt();
        for (int i=0; i<quantity; i++)
        {
            System.out.print("\nВведите кличку собаки: ");
            String name = scanner.next();
            System.out.print("\nВведите возраст собаки: ");
            double age = scanner.nextDouble();
            Dog_2 dog=new Dog_2(name,age);
            System.out.print("\nВведите место клитки в питомнике: ");
            int place = scanner.nextInt();
            this.ArrayOfDog[place-1]=dog;
        }
        System.out.println("\nНа какую собаку вы хотите посмотреть?");
        int place = scanner.nextInt() - 1;
        Dog_2.ToString(ArrayOfDog[place]);
        Dog_2.translationAge(ArrayOfDog[place]);
    }
}
