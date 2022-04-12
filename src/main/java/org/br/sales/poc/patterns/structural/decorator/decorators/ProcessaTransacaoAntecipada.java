package org.br.sales.poc.patterns.structural.decorator.decorators;

import org.br.sales.poc.patterns.structural.decorator.components.Processador;
import org.br.sales.poc.patterns.structural.decorator.model.Transacao;

import java.math.BigDecimal;

public class ProcessaTransacaoAntecipada extends ProcessadorDecorator {

    public ProcessaTransacaoAntecipada(Processador processador) {
        super(processador);
    }

    @Override
    public BigDecimal cobraTransacao(Transacao transacao) {
        BigDecimal value = this.processadorDecorator.cobraTransacao(transacao);
        return value.add(BigDecimal.ONE);
    }
}
