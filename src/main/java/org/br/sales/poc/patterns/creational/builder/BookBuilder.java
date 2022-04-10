package org.br.sales.poc.patterns.creational.builder;

import org.br.sales.poc.patterns.creational.builder.model.Author;
import org.br.sales.poc.patterns.creational.builder.model.Book;
import org.br.sales.poc.patterns.creational.builder.model.Genre;

import java.time.LocalDate;

public class BookBuilder {

    private Book book;

    public BookBuilder() {
        this.book = new Book();
    }

    public BookBuilder withId(Long id) {
        this.book.setId(id);
        return this;
    }

    public BookBuilder withTitle(String title) {
        this.book.setTitle(title);
        return this;
    }

    public BookBuilder withAuthor(Author author) {
        this.book.setAuthor(author);
        return this;
    }

    public BookBuilder withGenre(Genre genre) {
        this.book.setGenre(genre);
        return this;
    }

    public BookBuilder withISBN(String isbn) {
        this.book.setISBN(isbn);
        return this;
    }

    public BookBuilder withPublisher(String publisher) {
        this.book.setPublisher(publisher);
        return this;
    }

    public BookBuilder withDate(LocalDate date) {
        this.book.setDate(date);
        return this;
    }

    public Book build() {
        return book;
    }
}
