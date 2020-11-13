package com.company.task16.task1to2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите путь до папки:");
            String input = scanner.nextLine();
            File file = new File(input);
            double size = 0;
            size = getSize(file);
            int sizeIntWords = 0;
            while (size > 1024) {
                sizeIntWords++;
                size /= 1024;
            }
            String sizeStringWords = "";
            if (sizeIntWords == 0)
                sizeStringWords = " байт.";
            else if (sizeIntWords == 1)
                sizeStringWords = " Кб.";
            else if (sizeIntWords == 2)
                sizeStringWords = " Мб.";
            else
                sizeStringWords = " Гб.";
            System.out.println("Её размер равен: " + String.format("%.3f", size) + sizeStringWords);
            outputLogs("Время: " + new Date().toString() + ". " + "Путь к папке: " + input + ". Размер: " + String.format("%.3f", size) + sizeStringWords + "\n");
        }
        catch (Exception error)
        {
            System.out.println(error.toString());
        }
    }

    public static double getSize (File file){
        double size = 0;
        File[]filesFile = file.listFiles();
        assert filesFile != null;
        for (File value : filesFile) {
            if (value.isFile())
                size += value.length();
            else
                size += getSize(value);
        }
        return size;
    }

    public static void outputLogs(String input) throws IOException
    {
        String log = "LogsForProgramTask16Task1to2\\log.txt";
        File file = new File(log);
        if (new File("LogsForProgramTask16Task1to2").mkdirs())
            if (file.createNewFile())
                System.out.println("Первый запуск программы. Файл логов в соответствующей папке создан.");
        FileOutputStream outputStream = new FileOutputStream(log, true);
        outputStream.write(input.getBytes());
        outputStream.close();
    }
}
