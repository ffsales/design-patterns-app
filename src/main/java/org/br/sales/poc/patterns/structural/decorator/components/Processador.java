package org.br.sales.poc.patterns.structural.decorator.components;

import org.br.sales.poc.patterns.structural.decorator.model.Transacao;

import java.math.BigDecimal;

public interface Processador {

    BigDecimal cobraTransacao(Transacao transacao);
}
