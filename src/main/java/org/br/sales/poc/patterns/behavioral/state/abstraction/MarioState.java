package org.br.sales.poc.patterns.behavioral.state.abstraction;

public interface MarioState {

    MarioState pegarCogumelo();
    MarioState pegarFlor();
    MarioState pegarPena();
    MarioState levaDano();
}
