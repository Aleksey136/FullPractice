package com.company.task15.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> arrayNumbers = new ArrayList<String>();
        String[] arrayStringLetter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (String s : arrayStringLetter)
            for (int i2 = 0; i2 < 10; i2++)
                for (String value : arrayStringLetter)
                    for (String item : arrayStringLetter)
                        for (int i5 = 1; i5 < 200; i5++)
                            if (i5 < 10)
                                arrayNumbers.add(s + i2 + i2 + i2 + value + item + "0" + i5);
                            else
                                arrayNumbers.add(s + i2 + i2 + i2 + value + item + i5);
        HashSet<String> arrayNumberHash = new HashSet<String>(arrayNumbers);
        TreeSet<String> arrayNumberTree = new TreeSet<String>(arrayNumbers);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер, который хотите найти: ");
        String number = scanner.nextLine();
        long start = System.nanoTime();
        boolean output1 = arrayNumbers.contains(number);
        long end1 = System.nanoTime()-start;
        Collections.sort(arrayNumbers);
        start = System.nanoTime();
        int outputInt2 = Collections.binarySearch(arrayNumbers,number);
        long end2 = System.nanoTime()-start;
        boolean output2;
        output2 = outputInt2 >= 0;
        start = System.nanoTime();
        boolean output3 = arrayNumberHash.contains(number);
        long end3 = System.nanoTime()-start;
        start = System.nanoTime();
        boolean output4 = arrayNumberTree.contains(number);
        long end4 = System.nanoTime()-start;
        System.out.println("Поиск перебором: " + output1 + ", поиск занял: " + end1);
        System.out.println("Бинарный поиск: " + output2 + ", поиск занял: " + end2);
        System.out.println("Поиск в HashSet: " + output3 + ", поиск занял: " + end3);
        System.out.println("Поиск в TreeSet: " + output4 + ", поиск занял: " + end4);
    }
}
