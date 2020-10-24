package com.company.task13.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*String input = scanner.nextLine();*/
        String input = "Вася заработал 50000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        char[] inputChar = new char[100];
        input.getChars(input.lastIndexOf("Вася") + 15, input.indexOf(" рублей, Петя") , inputChar , 0);
        String strVasya = "";
        for (Character c : inputChar)
            strVasya += c.toString();
        int intVasya = Integer.parseInt(strVasya.trim());
        char[] inputChar2 = new char[100];
        input.getChars(input.lastIndexOf("Маша") + 7, input.lastIndexOf(" рублей") , inputChar2 , 0);
        String strMasha = "";
        for (Character c : inputChar2)
            strMasha += c.toString();
        int intMasha = Integer.parseInt(strMasha.trim());
        System.out.println("\n" + (intVasya+intMasha));
    }
}
