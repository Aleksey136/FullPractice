package com.company.task15.task1;

import java.util.ArrayList;
import java.util.List;

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
    }
}