package com.company.task3;

public class Book_3 {
    private String author;
    private String name;
    private String date;
    public Book_3 (String author, String name, String date) {
        this.author = author;
        this.name = name;
        this.date = date;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getDate(){
        return date;
    }
    public void setDate(String date){
        this.date=date;
    }
    public static void output(Book_3 book){
        System.out.println("Книгу написал: " + book.getAuthor());
        System.out.println("Название книги: " + book.getName());
        System.out.println("Книга написана: " + book.getDate());
    }
}
