package com.company.task15.task1;

public class Main {
    public static void main(String[] args) {
        String[] arrayStringLetter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (int i1 = 0; i1 < arrayStringLetter.length; i1++)
            for (int i2 = 0; i2 < 10; i2++)
                for (int i3 = 0; i3 < arrayStringLetter.length; i3++)
                    for (int i4 = 0; i4 < arrayStringLetter.length; i4++)
                        System.out.println();
    }
}
