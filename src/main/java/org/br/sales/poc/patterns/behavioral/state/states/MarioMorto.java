package org.br.sales.poc.patterns.behavioral.state.states;

import org.br.sales.poc.patterns.behavioral.state.abstraction.MarioState;

public class MarioMorto implements MarioState {
    @Override
    public MarioState pegarCogumelo() {
        System.out.println("Mario está morto");
        return null;
    }

    @Override
    public MarioState pegarFlor() {
        System.out.println("Mario está morto");
        return null;
    }

    @Override
    public MarioState pegarPena() {
        System.out.println("Mario está morto");
        return null;
    }

    @Override
    public MarioState levaDano() {
        System.out.println("Mario está morto");
        return null;
    }
}
