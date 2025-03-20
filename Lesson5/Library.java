package com.cmcglobal.Lesson5;

public class Library {
    //Các thuộc tính của hàm Library
    private Book[] books;
    private int bookCount;

    // Khởi tạo constructors - set những giá trị ban đầu của Library
    public Library(int capacity) {  //Set giá trị ban đầu của capacity
        this.books = new Book[capacity]; //khởi tạo books có thể chứa capacity phần tử - khai báo mảng books có capacity phần tử
        this.bookCount = 0; // khởi tạo giá trị ban đầu là thư viện chưa có sách
    }

    public void addBook(Book book) {    //biến book có kiểu dữ kiệu book - book là 1 object mang những thuộc tính của lớp Book
        if (bookCount < books.length) {  //books.length là số lượng elements trong books array
            books[bookCount] = book; //gán cuốn book cho phần từ đầu tiên của mảng book, bookCount khởi tạo bằng 0 nghĩa là khi thêm book1 thì vị trí 0 = book1
            bookCount++; //cập nhật số lượng sách
            System.out.println("Add book successfully: " + book.getTitle());
        } else {
            System.out.println("The library is full!");
        }
    }

    public void removeBook(String isbn) {
        for (int i = 0; i < bookCount; i++) { // duyệt tất cả các cuốn sách trong mảng books
            if (books[i].getIsbn().equals(isbn)) {   //ktra isbnn của sách tại vtri i có khớp vs isbn truyền vào hay ko
                // Sau khi đáp ứng điều kiện trong if - vòng lặp for sẽ chạy
                for (int j = i; j < bookCount - 1; j++) { //khởi tạo j = i tìm được ở trên
                    books[j] = books[j + 1]; // gán giá trị j = j+1
                }
                books[bookCount - 1] = null; //giá trị của bookCount - 1 trong array = null
                bookCount--;
                System.out.println("Book with ISBN " + isbn + " is removed");
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void searchBook(String query) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getTitle().toLowerCase().contains(query.toLowerCase()) ||
                    books[i].getAuthor().toLowerCase().contains(query.toLowerCase())) {
                books[i].displayBookDetail(); //gọi phương thức để in ra thông tin chi tiết về sách
            }
        }
    }

    public void displayAllBook() {
        for (int i = 0; i < bookCount; i++) {
            books[i].displayBookDetail();
        }
    }

    public void borrowBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                if (books[i].getIsAvailable()) { // nếu book available
                    books[i].setAvaiable(false); // set available thành false và print
                    System.out.println("Book with ISBN " + isbn + " borrowed");
                } else {
                    System.out.println("Book with ISBN " + isbn + " is already borrowed");
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }

    public void returnBook(String isbn) {
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getIsbn().equals(isbn)) {
                if (!books[i].getIsAvailable()) {
                    books[i].setAvaiable(true);
                    System.out.println("Book with ISBN " + isbn + " returned");
                } else {
                    System.out.println("Book with ISBN " + isbn + " is already returned");
                }
                return;
            }
        }
        System.out.println("Book with ISBN " + isbn + " not found.");
    }
}

