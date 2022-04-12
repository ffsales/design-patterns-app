package org.br.sales.poc.patterns.structural.decorator.decorators;

import org.br.sales.poc.patterns.structural.decorator.components.Processador;

public abstract class ProcessadorDecorator implements Processador {

    protected Processador processadorDecorator;

    public ProcessadorDecorator(Processador processador) {
        this.processadorDecorator = processador;
    }

}
