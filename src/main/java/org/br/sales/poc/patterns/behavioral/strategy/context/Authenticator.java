package org.br.sales.poc.patterns.behavioral.strategy.context;

import org.br.sales.poc.patterns.behavioral.strategy.strategies.AuthenticatorStrategy;
import org.br.sales.poc.patterns.behavioral.strategy.strategies.AuthEnum;

public class Authenticator {

    private AuthenticatorStrategy strategy;

    public Authenticator(AuthEnum encryptions) {
        this.strategy = encryptions.getAuthenticatorStrategy();
    }

    public void authenticate(String user, String pass) {
        strategy.authenticate(user, pass);
    }
}
