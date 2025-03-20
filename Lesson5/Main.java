package com.cmcglobal.Lesson5;
import com.cmcglobal.Lesson5.Book;
import com.cmcglobal.Lesson5.Library;

public class Main {
    public static void main (String[] args){
        Library library1 = new Library(5);

        Book myBook1 = new Book("titlebook1","author1", "123abc123");
        Book myBook2 = new Book("titlebook2","author2", "345abc345");
        Book myBook3 = new Book("titlebook3","author3", "678abc678");

        //Display Book Detail
//        myBook1.displayBookDetail();
//        System.out.println("-----------------------------------");
//        myBook2.displayBookDetail();
//        System.out.println("-----------------------------------");
//        myBook3.displayBookDetail();

        //Add book to Library
        library1.addBook(myBook1);
        library1.addBook(myBook2);
        library1.addBook(myBook3);

        //Remove book
//        library1.removeBook("123");

        //Search Book
//        System.out.println("\nSearching Book: ");
//        library1.searchBook("book1");

        //Display all book
        System.out.println("\nAll Book in the Library:");
        library1.displayAllBook();

        // Borrow Book
        System.out.println("\nBorrowed Book: ");
        library1.borrowBook("123abc123");

        //Display all book after borrowing
        System.out.println("\nAll Book in the Library after borrowing:");
        library1.displayAllBook();

        // Return Book
        System.out.println("\nBook Returned:");
        library1.returnBook("345abc345");

        //Display all book after returning
        System.out.println("\nAll Book in the Library after returning:");
        library1.displayAllBook();



    }
}
