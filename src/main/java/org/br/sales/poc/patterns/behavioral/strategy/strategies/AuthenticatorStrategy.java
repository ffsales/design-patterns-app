package org.br.sales.poc.patterns.behavioral.strategy.strategies;

public interface AuthenticatorStrategy {

    void authenticate(String user, String pass);
}
