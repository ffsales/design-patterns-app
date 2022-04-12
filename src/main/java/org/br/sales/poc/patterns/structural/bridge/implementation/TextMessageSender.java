package org.br.sales.poc.patterns.structural.bridge.implementation;

public class TextMessageSender implements MessageSender {

    @Override
    public void sendMessage() {
        System.out.println("TextMessageSender: Enviando mensagem de texto...");
    }
}
