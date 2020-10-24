package com.company.task14.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    /*public static void main(String[] args) {
        ArrayList<String> deals = new ArrayList<>();
        deals.add("Встать с кровати.");
        deals.add("Умыться и поесть.");
        deals.add("Одеться в повседневную одежду.");
        deals.add("Выйти из дома.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду, которую хотите выполнить: (End - чтобы остановить программу)");
        String command = scanner.next();
        while (!command.equals("End")) {
            char[] commandChar = new char[100];
            for (int i = 0; i < command.length(); i++) {
                commandChar[i] = command.charAt(i);
            }
            int quantitySpace = 0;
            for (int i = 0; i < command.length(); i++) {
                if (commandChar[i] == ' ')
                    quantitySpace++;
            }
            if ((quantitySpace == 0) && (command.equals("LIST"))) {
                for (int i = 0; i < deals.size(); i++) {
                    System.out.println(i + ". " + deals.get(i));
                }
            } else if (quantitySpace == 1) {
                int placeSpace = 0;
                for (int i = 0; i < command.length(); i++) {
                    if (commandChar[i] == ' ')
                        placeSpace = i;
                }
                String partCommand = "";
                for (int i = 0; i < placeSpace; i++) {
                    partCommand += commandChar[i];
                }
                if (partCommand.equals("DELETE")) {
                    String partCommandNumber = "";
                    for (int i = placeSpace + 1; i < command.length(); i++) {
                        partCommand += commandChar[i];
                    }
                    int intPartCommandNumber = Integer.parseInt(partCommandNumber);
                    if (intPartCommandNumber >= 0 && intPartCommandNumber < deals.size())
                        deals.remove(intPartCommandNumber);
                    else
                        System.out.println("Неккоректный ввод.");
                } else if (partCommand.equals("ADD")) {
                    String deal = "";
                    for (int i = placeSpace + 1; i < command.length(); i++) {
                        deal += commandChar[i];
                    }
                    deals.add(deal);
                } else
                    System.out.println("Неккоректный ввод.");
            } else if (quantitySpace == 2) {
                int placeSpace1 = -1;
                int placeSpace2 = -2;
                for (int i = 0; i < command.length(); i++) {
                    if (commandChar[i] == ' ')
                        placeSpace2 = i;
                }
                for (int i = 0; i < command.length(); i++) {
                    if (commandChar[i] == ' ') {
                        placeSpace1 = i;
                        if (placeSpace1 != placeSpace2)
                            break;
                    }
                }
                String partCommand1 = "";
                String partCommand2 = "";
                String partCommand3 = "";
                for (int i = 0; i < placeSpace1; i++) {
                    partCommand1 += commandChar[i];
                }
                for (int i = placeSpace1 + 1; i < placeSpace2; i++) {
                    partCommand2 += commandChar[i];
                }
                for (int i = placeSpace2 + 1; i < command.length(); i++) {
                    partCommand3 += commandChar[i];
                }
                int intPartCommand2 = Integer.parseInt(partCommand2);
                if (partCommand1.equals("EDIT")) {
                    if (intPartCommand2 >= 0 && intPartCommand2 < deals.size())
                        deals.set(intPartCommand2, partCommand3);
                    else
                        System.out.println("Неккоректный ввод.");
                } else if (partCommand1.equals("ADD")) {
                    if (intPartCommand2 >= 0 && intPartCommand2 < deals.size())
                        deals.add(intPartCommand2, partCommand3);
                    else
                        System.out.println("Неккоректный ввод.");
                } else
                    System.out.println("Неккоректный ввод.");
            } else
                System.out.println("Неккоректный ввод.");
            command = scanner.next();
        }
    }*/
}

