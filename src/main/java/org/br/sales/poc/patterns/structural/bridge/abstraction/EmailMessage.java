package org.br.sales.poc.patterns.structural.bridge.abstraction;

import org.br.sales.poc.patterns.structural.bridge.implementation.MessageSender;

public class EmailMessage extends Message {

    public EmailMessage(MessageSender messageSender){
        super(messageSender);
    }

    @Override
    public void send() {
        messageSender.sendMessage();
    }
}
