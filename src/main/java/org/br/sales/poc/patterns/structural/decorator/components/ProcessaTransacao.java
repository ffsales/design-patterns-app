package org.br.sales.poc.patterns.structural.decorator.components;

import org.br.sales.poc.patterns.structural.decorator.model.Transacao;

import java.math.BigDecimal;

public class ProcessaTransacao implements Processador {

    @Override
    public BigDecimal cobraTransacao(Transacao transacao) {

        return transacao.getAmount().multiply(BigDecimal.valueOf(1.05));
    }
}
