package com.company.task3;

import java.util.Scanner;

public class BookTest_3 {
    public static void main(String[] args){
        Book_3 book = new Book_3("Ivan Ivanovich","Life", "01.01.2000");
        Book_3.output(book);
        System.out.print("Попробуйте изменить дату: ");
        Scanner scanner = new Scanner(System.in);
        String data = scanner.next();
        book.setDate(data);
        System.out.println("Изменненые данные книги:");
        Book_3.output(book);
    }
}
