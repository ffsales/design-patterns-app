package org.br.sales.poc.patterns.creational.builder;

import org.br.sales.poc.patterns.creational.builder.model.Author;
import org.br.sales.poc.patterns.creational.builder.model.Book;
import org.br.sales.poc.patterns.creational.builder.model.Genre;

import java.time.LocalDate;

public class Builder {

    /*
    Prós
        Constói objetos passo a passo, fica mais legível
        Implementa o Princípio de responsabilidade única.

    Contras
        Aumenta a complexidade
     */
    public static void main(String[] args) {
        Builder buildingBook = new Builder();

        buildingBook.withoutBuilder();

        buildingBook.withBuilder();
    }

    public void withoutBuilder() {

        Author author = new Author(1l, "Leandro Karnal", LocalDate.now());
        Book book = new Book(2l, "Livro sem Builder", author, Genre.HORROR, "123-456", "Editora Abril", LocalDate.now());

        System.out.println("Livro sem Builder: ".concat(book.toString()));
    }

    public void withBuilder() {
        AuthorBuilder authorBuilder = new AuthorBuilder();
        Author author = authorBuilder
                            .withId(1l)
                .withName("Cortella")
                            .build();
        BookBuilder bookBuilder = new BookBuilder();
        Book book = bookBuilder
                .withId(2l)
                .withTitle("Livro com Builder")
                .withAuthor(author)
                .build();

        System.out.println("Livro com Builder: ".concat(book.toString()));
    }
}
