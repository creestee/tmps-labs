package org.faf;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Autohr", "Text to be printed", "Name");
        Printer printer = new Printer();

        printer.print(book);
    }
}