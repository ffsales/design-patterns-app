package org.br.sales.poc.patterns.behavioral.strategy.strategies.concrete;

import org.br.sales.poc.patterns.behavioral.strategy.strategies.AuthenticatorStrategy;

public class ClientCredentialsStrategy implements AuthenticatorStrategy {
    @Override
    public void authenticate(String user, String pass) {
        System.out.println("\n-------Autenticando com ClientCredentials-------");
    }
}
