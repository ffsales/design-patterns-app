package org.br.sales.poc.patterns.behavioral.strategy.strategies;

import lombok.Getter;
import org.br.sales.poc.patterns.behavioral.strategy.strategies.concrete.BasicAuthenticationStrategy;
import org.br.sales.poc.patterns.behavioral.strategy.strategies.concrete.ClientCredentialsStrategy;

public enum AuthEnum {

    BASIC(new BasicAuthenticationStrategy()),
    CLIENT_CREDENTIALS(new ClientCredentialsStrategy());

    @Getter
    private AuthenticatorStrategy authenticatorStrategy;

    AuthEnum(AuthenticatorStrategy authenticatorStrategy) {
        this.authenticatorStrategy = authenticatorStrategy;
    }
}
