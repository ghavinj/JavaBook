package com.ghavinj.javabook;

public class Book {

    private String bookTitle;
    private String bookGenre;
    private int totalPages;
    private String author;

    public Book(String bookTitle, String bookGenre, int totalPages, String author) {
        this.bookTitle = bookTitle;
        this.bookGenre = bookGenre;
        this.totalPages = totalPages;
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }




    //Book behaviors
    public void turnPage(){
        System.out.println("Page Turned!");
    }

    public void openBook(){
        System.out.println("Book Open!");
    }
    public void closeBook(){
        System.out.println("Book Closed!");
    }

    public void showBookDetails(){

        System.out.println(this.getBookTitle()+ " " + this.getAuthor() + " " + this.getBookGenre() + " " + this.getTotalPages());

    }


}
