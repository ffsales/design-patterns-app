package org.br.sales.poc.patterns.behavioral.state.states;

import org.br.sales.poc.patterns.behavioral.state.abstraction.MarioState;

public class MarioDeFogo implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario De Fogo ganhou 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario De Fogo ganhou 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario De Capa");
        return new MarioDeCapa();
    }

    @Override
    public MarioState levaDano() {
        System.out.println("Mario Grande");
        return new MarioGrande();
    }
}
