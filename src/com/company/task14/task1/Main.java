package com.company.task14.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> deals = new ArrayList<>();
        deals.add("Встать с кровати.");
        deals.add("Умыться и поесть.");
        deals.add("Одеться в повседневную одежду.");
        deals.add("Выйти из дома.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите команду, которую хотите выполнить: (End - чтобы остановить программу)");
        String command = scanner.nextLine();
        while (!command.equals("End")) {

            String[] words = command.split(" ");

            if (words[0].equals("LIST") && (words.length==1)) {
                for (int i = 0; i < deals.size(); i++) {
                    System.out.println(i + ". " + deals.get(i));
                }

            } else if (words[0].equals("DELETE") && (words.length==2)) {
                    int intPartCommandNumber = Integer.parseInt(words[1]);
                    if (intPartCommandNumber >= 0 && intPartCommandNumber < deals.size())
                        deals.remove(intPartCommandNumber);
                    else
                        System.out.println("Неккоректный ввод.");

            } else if (words[0].equals("ADD") && (words.length>1) && !(words[1].charAt(0)>='0' && words[1].charAt(0)<='9')) {
                String word = "";
                for (int i = 1; i < words.length; i++)
                    word += words[i] + " ";
                deals.add(word);

            } else if ((words[0].equals("EDIT")) && (words.length>2) && ((Integer.parseInt(words[1])>=0)&&(Integer.parseInt(words[1])<deals.size()))){
                int intPartCommandNumber = Integer.parseInt(words[1]);
                if (intPartCommandNumber >= 0 && intPartCommandNumber < deals.size()) {
                    String word = "";
                    for (int i = 2; i < words.length; i++)
                        word += words[i] + " ";
                    deals.set(intPartCommandNumber, word);
                }
                else
                    System.out.println("Неккоректный ввод.");

            } else if (words[0].equals("ADD") && (words.length>2) && ((Integer.parseInt(words[1])>=0)&&(Integer.parseInt(words[1])<deals.size()))) {
                int intPartCommandNumber = Integer.parseInt(words[1]);
                if (intPartCommandNumber >= 0 && intPartCommandNumber < deals.size()) {
                    String word = "";
                    for (int i = 2; i < words.length; i++)
                        word += words[i] + " ";
                    deals.add(intPartCommandNumber, word);
                }
                else
                    System.out.println("Неккоректный ввод.");
            } else
                System.out.println("Неккоректный ввод.");

            command = scanner.nextLine();
        }
    }
}