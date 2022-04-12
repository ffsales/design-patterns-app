package org.br.sales.poc.patterns.behavioral.state.states;

import org.br.sales.poc.patterns.behavioral.state.abstraction.MarioState;

public class MarioGrande implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario Grande ganhou 1000 pontos");
        return this;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario De Fogo");
        return new MarioDeFogo();
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario De Capa");
        return new MarioDeCapa();
    }

    @Override
    public MarioState levaDano() {
        System.out.println("Mario Pequeno");
        return new MarioPequeno();
    }
}
