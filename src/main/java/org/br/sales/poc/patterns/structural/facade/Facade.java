package org.br.sales.poc.patterns.structural.facade;

import org.br.sales.poc.patterns.structural.facade.model.InformeRendimento;
import org.br.sales.poc.patterns.structural.facade.servicefacade.InformeRendimentoFacade;

public class Facade {

    /*
    Prós
        Isola a complexidade

    Contras
        O objeto facade pode se tornar um "faz tudo"
     */
    public static void main(String[] args) {
        InformeRendimentoFacade facade = new InformeRendimentoFacade(2021);

        InformeRendimento informe = facade.getInforme("123.456.789-01");

        System.out.println("Informe: ".concat(informe.toString()));
    }
}
