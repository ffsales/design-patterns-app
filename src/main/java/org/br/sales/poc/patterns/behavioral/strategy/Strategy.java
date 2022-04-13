package org.br.sales.poc.patterns.behavioral.strategy;

import org.br.sales.poc.patterns.behavioral.strategy.context.Authenticator;
import org.br.sales.poc.patterns.behavioral.strategy.strategies.AuthEnum;

public class Strategy {

    /*
    Prós
        Implementa Princípio aberto/fechado
        Subistitui herança por composição
        Isola algoritmos

    Contras
        Risco de alta de complexidade caso a quantidade de estratégias sejam poucas
        Necessário que os clientes conheçam as estratégias para selecionar a adequada
     */
    public static void main(String[] args) {

        Authenticator basicAuthenticator =new Authenticator(AuthEnum.BASIC);
        basicAuthenticator.authenticate("user", "pass");
        Authenticator clientCredentialsAuthenticator =new Authenticator(AuthEnum.CLIENT_CREDENTIALS);
        clientCredentialsAuthenticator.authenticate("client", "secretKey");
    }
}
