package com.company.task13.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String input = scanner.nextLine();*/
        String input = "Иванов Сергей Петрович";
        String firstName = "";
        String lastName = "";
        String patronymicName = "";
        char[] inputChar = new char[100];
        for (int i = 0; i < input.length(); i++)
            inputChar[i] = input.charAt(i);
        int quantityChar = 0;
        for (int i = 0; i < input.length(); i++)
            if (inputChar[i] == ' ')
                quantityChar++;
        if (quantityChar == 0 || quantityChar > 2) {
            System.out.println("Введенная строка не является ФИО");
        }
        else if (quantityChar == 1) {
            int placeSpace = 0;
            for (int i = 0; i < input.length(); i++) {
                if (inputChar[i] == ' ')
                    placeSpace = i;
            }
            for (int i = 0; i < placeSpace; i++) {
                lastName += inputChar[i];
            }
            for (int i = placeSpace+1; i < input.length(); i++) {
                firstName += inputChar[i];
            }
            System.out.println("Фамилия: " + lastName + "\nИмя: " + firstName);
        }
        else if (quantityChar == 2) {
            int placeSpace1 = -1;
            int placeSpace2 = -2;
            for (int i = 0; i < input.length(); i++) {
                if (inputChar[i] == ' ')
                    placeSpace2 = i;
            }
            for (int i = 0; i < input.length(); i++) {
                if (inputChar[i] == ' '){
                    placeSpace1 = i;
                    if (placeSpace1!=placeSpace2)
                        break;
                }
            }
            for (int i = 0; i < placeSpace1; i++) {
                lastName += inputChar[i];
            }
            for (int i = placeSpace1+1; i < placeSpace2; i++) {
                firstName += inputChar[i];
            }
            for (int i = placeSpace2+1; i < input.length(); i++) {
                patronymicName += inputChar[i];
            }
            System.out.println("Фамилия: " + lastName + "\nИмя: " + firstName + "\nОтчество: " + patronymicName);
        }
    }
}
