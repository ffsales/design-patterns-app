package org.br.sales.poc.patterns.behavioral.state.model;

import org.br.sales.poc.patterns.behavioral.state.abstraction.MarioState;
import org.br.sales.poc.patterns.behavioral.state.states.MarioPequeno;

public class Mario {

    protected MarioState state;

    public Mario() {
        state = new MarioPequeno();
    }

    public void pegarCogumelo() {
        state = state.pegarCogumelo();
    }

    public void pegarFlor() {
        state = state.pegarFlor();
    }

    public void pegarPena() {
        state = state.pegarPena();
    }

    public void levaDano() {
        state = state.levaDano();
    }
}
