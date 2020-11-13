package com.company.task16.task3;

import java.io.*;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите путь из какой папки будет произведено копирование:");
        String input1 = scanner.nextLine();
        System.out.println("Введите путь к тому, во что хотите копировать (если таковой не существует, она будет создана):");
        String input2 = scanner.nextLine();
        File inputFile1 = new File(input1);
        File inputFile2 = new File(input2);
        copy(inputFile1, inputFile2);
        System.out.println("Данное действие произошло. Из начальной папки скопировано содержимое.");
    }

    public static void copy(File input1, File input2) throws IOException {
        if (input1.isDirectory()) {
            copyDirectory(input1, input2);
        } else {
            copyFile(input1, input2);
        }
    }

    private static void copyDirectory(File input1, File input2) throws IOException {
        if (!input2.exists()) {
            input2.mkdirs();
        }
        for (String f : Objects.requireNonNull(input1.list())) {
            copy(new File(input1, f), new File(input2, f));
        }
    }

    private static void copyFile(File input1, File input2) throws IOException {
        try (
                InputStream in = new FileInputStream(input1);
                OutputStream out = new FileOutputStream(input2)
        ) {
            byte[] buf = new byte[1024];
            int length;
            while ((length = in.read(buf)) > 0) {
                out.write(buf, 0, length);
            }
        }
    }
}
