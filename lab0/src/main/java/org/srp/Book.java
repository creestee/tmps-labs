package org.srp;

public class Book implements Printable{

    private String author;
    private String text;
    private String name;

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getText() {
        return text;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Book(String author, String text, String name) {
        this.author = author;
        this.text = text;
        this.name = name;
    }

    @Override
    public String getContent() {
        return text;
    }

}
