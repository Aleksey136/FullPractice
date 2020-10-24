package com.company.java13.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваш данный номер:");
        String input = scanner.nextLine();
        String phone = "";
        char[] inputChar = new char[100];
        for (int i = 0; i < input.length(); i++)
            inputChar[i] = input.charAt(i);
        char[] phoneChar = new char[15];
        int counter = 0;
        for (int i = 0; i < input.length(); i++) {
            if ((i == 0) && (inputChar[i] == '+')) {
                phoneChar[counter]=inputChar[i];
                counter++;
            }
            if ((inputChar[i] == '0') || (inputChar[i] == '1') || (inputChar[i] == '2') || (inputChar[i] == '3') ||
                    (inputChar[i] == '4') || (inputChar[i] == '5') || (inputChar[i] == '6') || (inputChar[i] == '7') ||
                    (inputChar[i] == '8') || (inputChar[i] == '9')) {
                if (counter<15){
                    phoneChar[counter]=inputChar[i];
                    counter++;
                }
            }
        }
        if ((counter==11)&&(phoneChar[0]!='+')&&((phoneChar[0]=='7')||(phoneChar[0]=='8'))){
            System.out.println("+7 (" + phoneChar[1] + phoneChar[2] + phoneChar[3] + ") " + phoneChar[4] +
                    phoneChar[5] + phoneChar[6] + "-" + phoneChar[7] + phoneChar[8] + "-" + phoneChar[9] + phoneChar[10]);
        }
        else if ((counter==10)&&(phoneChar[0]!='+')){
            System.out.println("+7 (" + phoneChar[0] + phoneChar[1] + phoneChar[2] + ") " + phoneChar[3] +
                    phoneChar[4] + phoneChar[5] + "-" + phoneChar[6] + phoneChar[7] + "-" + phoneChar[8] + phoneChar[9]);
        }
        else if ((counter==12)&&(phoneChar[0]=='+')&&(phoneChar[1]=='7')){
            System.out.println("+7 (" + phoneChar[2] + phoneChar[3] + phoneChar[4] + ") " + phoneChar[5] +
                    phoneChar[6] + phoneChar[7] + "-" + phoneChar[8] + phoneChar[9] + "-" + phoneChar[10] + phoneChar[11]);
        }
        else
            System.out.println("Неверный формат номера");
    }
}
