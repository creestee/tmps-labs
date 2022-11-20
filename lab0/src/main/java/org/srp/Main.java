package org.srp;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Author", "Text to be printed", "Name");
        Printer printer = new Printer();

        printer.print(book);
    }
}