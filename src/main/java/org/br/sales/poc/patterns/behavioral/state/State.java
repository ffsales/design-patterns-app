package org.br.sales.poc.patterns.behavioral.state;

import org.br.sales.poc.patterns.behavioral.state.model.Mario;

public class State {

    /*
    Prós
        Implementa o Princípio de responsabilidade única
        Implementa o Princípio aberto/fechado
        Simplifica o código quando houver muitos estados

    Contras
        Se houver poucos estados aplicar o padrão pode ser um exagero
     */
    public static void main(String[] args) {

        Mario mario = new Mario();
        mario.pegarCogumelo();
        mario.pegarPena();
        mario.levaDano();
        mario.pegarFlor();
        mario.pegarFlor();
        mario.levaDano();
        mario.pegarCogumelo();
        mario.levaDano();
        mario.levaDano();
        mario.levaDano();
    }
}
