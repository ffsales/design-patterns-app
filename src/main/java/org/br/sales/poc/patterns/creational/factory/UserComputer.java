package org.br.sales.poc.patterns.creational.factory;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserComputer implements Computer {

    private final String ram;
    private final String cpu;
    private final String hdd;

    @Override
    public String getRam() {
        return ram;
    }

    @Override
    public String getCpu() {
        return cpu;
    }

    @Override
    public String getHdd() {
        return hdd;
    }

    @Override
    public String toString() {
        return "UserComputer{" +
                "ram='" + ram + '\'' +
                ", cpu='" + cpu + '\'' +
                ", hdd='" + hdd + '\'' +
                '}';
    }
}
