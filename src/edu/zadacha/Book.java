package edu.zadacha;

import java.util.Arrays;
import java.util.InputMismatchException;

public class Book {
    final int[] ISBN_LENGTHS = {10, 13};
    public String title, author, publisher, isbn;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setTitle(String title) {
        if(title == null || title.length() == 0) {
            throw new InputMismatchException("Title must not be null or zero length");
        }
        this.title = title;
    }

    public void setAuthor(String author) {
        if(author == null || author.length() == 0) {
            throw new InputMismatchException("Author must not be null or zero length");
        }
        this.author = author;
    }

    public void setPublisher(String publisher) {
        if(publisher == null || publisher.length() == 0) {
            throw new InputMismatchException("Publisher must not be null or zero length");
        }
        this.publisher = publisher;
    }

    public void setIsbn(String isbn) {
        if(isbn == null || isbn.length() == 0) {
            throw new InputMismatchException("ISBN must not be null or zero length");
        }
        if(!Arrays.asList(this.ISBN_LENGTHS).contains(Integer.valueOf(isbn).toString().length())) {
            throw new InputMismatchException("ISBN should have 10 or 13 digits");
        }
        this.isbn = isbn;
    }

    public Book() {
        this.setTitle("Default book");
        this.setAuthor("Default author");
        this.setPublisher("Default publisher");
        this.setIsbn("1234567890123");
    }

    public Book(String title, String author, String publisher, String isbn) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(publisher);
        this.setIsbn(isbn);
    }

    @Override
    public String toString() {
        return "Book{" +
                "Title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", isbn='" + isbn + '\'' +
                '}';
    }
}
