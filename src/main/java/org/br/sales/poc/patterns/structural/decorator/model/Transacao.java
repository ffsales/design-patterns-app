package org.br.sales.poc.patterns.structural.decorator.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
@ToString
public class Transacao {

    private Long id;
    private String description;
    private BigDecimal amount;
}
