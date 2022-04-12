package org.br.sales.poc.patterns.structural.facade.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class Rendimento {

    private String cnpj;
    private String description;
    private BigDecimal amountInit;
    private BigDecimal amountEnd;
}
