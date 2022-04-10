package org.br.sales.poc.patterns.creational.builder.model;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {

    private long id;
    private String title;
    private Author author;
    private Genre genre;
    private String ISBN;
    private String publisher;
    private LocalDate date;
}
