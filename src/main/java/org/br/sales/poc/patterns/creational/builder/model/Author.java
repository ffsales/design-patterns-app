package org.br.sales.poc.patterns.creational.builder.model;

import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Author {
    private long id;
    private String name;
    private LocalDate date;
}
