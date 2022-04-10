package org.br.sales.poc.patterns.creational.factory;

public class FactoryComputer {

    public static Computer factoryComputer(String type, String ram, String cpu, String hdd) {
        if ("server".equals(type)) {
            return new Server(ram, cpu, hdd);
        } else if ("user".equals(type)) {
            return new UserComputer(ram, cpu, hdd);
        } else {
            throw new IllegalArgumentException("Tipo de computador inválido");
        }
    }
}
