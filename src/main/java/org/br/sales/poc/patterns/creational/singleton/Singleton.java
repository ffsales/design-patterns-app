package org.br.sales.poc.patterns.creational.singleton;

public class Singleton {

    /*
    Prós
        Garante que exista apenas uma instância da sua classe

    Contras
        Dificulta testes unitários por que o construtor é privado
     */
    public static void main(String[] args) {

        UniqueConfiguration1 config1 = new UniqueConfiguration1();

        UniqueConfiguration2 config2 = new UniqueConfiguration2();

        UniqueConfiguration3 config3 = new UniqueConfiguration3();

        UniqueConfiguration4 config4 = new UniqueConfiguration4();

        System.out.println("config1: ".concat(config1.getConfiguration().getUrlBase()));
        System.out.println("config2: ".concat(config2.getConfiguration().getUrlBase()));
        System.out.println("config3: ".concat(config3.getConfiguration().getUrlBase()));
        System.out.println("config4: ".concat(config4.getConfiguration().getUrlBase()));
    }
}
