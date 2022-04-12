package org.br.sales.poc.patterns.behavioral.state.states;

import org.br.sales.poc.patterns.behavioral.state.abstraction.MarioState;

public class MarioPequeno implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario Grande");
        return new MarioGrande();
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
        System.out.println("Mario Morto");
        return new MarioMorto();
    }
}
