package com.company.task15.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayNumbers = new ArrayList<String>();
        String[] arrayStringLetter = {"А", "В", "Е", "К", "М", "Н", "О", "Р", "С", "Т", "У", "Х"};
        for (int i1 = 0; i1 < arrayStringLetter.length; i1++)
            for (int i2 = 0; i2 < 10; i2++)
                for (int i3 = 0; i3 < arrayStringLetter.length; i3++)
                    for (int i4 = 0; i4 < arrayStringLetter.length; i4++)
                        for (int i5 = 1; i5 < 200; i5++)
                            if (i5<10)
                                arrayNumbers.add(arrayStringLetter[i1]);

    }
}
