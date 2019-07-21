package com.ghavinj.javabook;

public class JavaBook {
    public static void main(String[] args){

        Book bookOne = new Book("", "", ' ',"");
        Book bookTwo = new Book("", "", ' ',"");

        //Book One
        bookOne.setAuthor("Napoleon Hill");
        bookOne.setBookTitle("Think and Grow Rich");
        bookOne.setTotalPages(350);
        bookOne.setBookGenre("Non-Fiction");

        //Book Two
        bookTwo.setBookGenre("Non-Fiction");
        bookTwo.setBookTitle("The Science of Getting Rich");
        bookTwo.setTotalPages(200);
        bookTwo.setAuthor("Wallas D Wattles");

        System.out.println("It works!");

    }
}
