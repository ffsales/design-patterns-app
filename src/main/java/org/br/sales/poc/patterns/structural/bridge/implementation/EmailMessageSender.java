package org.br.sales.poc.patterns.structural.bridge.implementation;

public class EmailMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("EmailMessageSender: Enviando email...");
    }
}
