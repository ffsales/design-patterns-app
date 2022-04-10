package org.br.sales.poc.patterns.creational.factory;

public class Factory {

    /*
    Prós
        Implementa o Princípio de responsabilidade única e o Princípio aberto/fechado

    Contra
        Aumenta a complexidade
     */
    public static void main(String[] args) {

        Computer server = FactoryComputer.factoryComputer("server", "128GB", "I-9", "5TB");
        Computer notebook = FactoryComputer.factoryComputer("user", "8GB", "I-5", "256GB");

        System.out.println("Computador 1: ".concat(server.toString()));
        System.out.println("Computador 2: ".concat(notebook.toString()));

        FactoryComputer.factoryComputer("gamer", "32GB", "I-7", "1TB");
    }
}
