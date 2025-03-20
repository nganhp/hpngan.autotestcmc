package com.cmcglobal.Lesson5;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private Boolean isAvailable;

    public Book (String title, String author, String isbn){
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }
    public String getTitle(){
        return this.title;
    }
    public String getAuthor(){
        return this.author;
    }
    public String getIsbn(){
        return this.isbn;
    }
    public boolean getIsAvailable(){
        return isAvailable;
    }
    public boolean setAvaiable(boolean available){
        isAvailable = available;
        return available;
    }

    public void displayBookDetail() {
        System.out.println("Title: " + title );
        System.out.println("Author: " + author );
        System.out.println("ISBN: " + isbn );
        System.out.println("Availability: " + (isAvailable ? "Available" : "Borrowed")); // biểu_thức_điều_kiện ? biểu_thức_1 : biểu_thức_2 (nếu biểu thức điều kiện true > print ra biểu thức 1 và ngược lại)
        System.out.println("--------------------------------");
    }
    public boolean checkAvailability(){
        return isAvailable;
    }



}
