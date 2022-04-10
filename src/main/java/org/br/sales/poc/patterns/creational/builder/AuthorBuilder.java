package org.br.sales.poc.patterns.creational.builder;

import org.br.sales.poc.patterns.creational.builder.model.Author;

import java.time.LocalDate;

public class AuthorBuilder {

    private Author author;

    public AuthorBuilder() {
        this.author = new Author();
    }

    public AuthorBuilder withId(long id) {
        this.author.setId(id);
        return this;
    }

    public AuthorBuilder withName(String name) {
        this.author.setName(name);
        return this;
    }

    public AuthorBuilder withDate(LocalDate date) {
        this.author.setDate(date);
        return this;
    }

    public Author build() {
        return this.author;
    }
}
