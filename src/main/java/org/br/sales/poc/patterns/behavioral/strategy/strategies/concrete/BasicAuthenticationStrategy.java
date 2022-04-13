package org.br.sales.poc.patterns.behavioral.strategy.strategies.concrete;

import org.br.sales.poc.patterns.behavioral.strategy.strategies.AuthenticatorStrategy;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class BasicAuthenticationStrategy implements AuthenticatorStrategy {
    @Override
    public void authenticate(String user, String pass) {
        System.out.println("-------Autenticando com user e senha-------");
    }
}
