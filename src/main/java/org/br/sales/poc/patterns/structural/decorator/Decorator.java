package org.br.sales.poc.patterns.structural.decorator;

import org.br.sales.poc.patterns.structural.decorator.components.ProcessaTransacao;
import org.br.sales.poc.patterns.structural.decorator.components.Processador;
import org.br.sales.poc.patterns.structural.decorator.decorators.ProcessaTransacaoAntecipada;
import org.br.sales.poc.patterns.structural.decorator.decorators.ProcessaTransacaoComTaxaFinanceira;
import org.br.sales.poc.patterns.structural.decorator.model.Transacao;

import java.math.BigDecimal;

public class Decorator {

    /*
        Prós
            Permite extender um comportamento sem fazer uma nova sub classe
            Implementa o Princípio de responsabilidade única

        Contra
            É dificil remover um decorator de uma pilha de decorator
     */
    public static void main(String[] args) {

        Transacao transacao = Transacao.builder()
                .amount(BigDecimal.TEN)
                .id(1l)
                .description("Transação")
                .build();

        Processador processaTransacao = new ProcessaTransacao();
        ProcessaTransacaoComTaxaFinanceira processaTransacaoComTaxaFinanceira = new ProcessaTransacaoComTaxaFinanceira(processaTransacao);
        ProcessaTransacaoAntecipada processaTransacaoAntecipada = new ProcessaTransacaoAntecipada(processaTransacaoComTaxaFinanceira);

        System.out.println("Transacao: ".concat(transacao.toString()));
        System.out.println("Transação Processada: " + processaTransacao.cobraTransacao(transacao));
        System.out.println("Transação Processada Financeira: " + processaTransacaoComTaxaFinanceira.cobraTransacao(transacao));
        System.out.println("Transação Processada Antecipadamente: " + processaTransacaoAntecipada.cobraTransacao(transacao));
    }
}
